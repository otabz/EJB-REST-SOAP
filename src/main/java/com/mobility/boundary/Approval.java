package com.mobility.boundary;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import com.mobility.boundary.Result.Outcome;
import com.waseel.ApprovalCriteriaCT;
import com.waseel.ApprovalInquiryRequestCT;
import com.waseel.ApprovalInquiryRequestCT.ApprovalReference;
import com.waseel.ApprovalDetailResponseCT;
import com.waseel.ApprovalInquiryResponseCT;
import com.waseel.ApprovalLineCT;
import com.waseel.ApprovalSummaryResponseCT;
import com.waseel.ErrorResponseCT;
import com.waseel.MessageHeaderCT;
import com.waseel.StatusCT;
import com.waseel.StatusCodeST;
import com.waseel.TransactionSubTypeST;
import com.waseel.TransactionTypeST;
import com.waseel.TransactionWrapper;
import com.waseel.UhudInterface;

public class Approval {

	private Approval() {
	}

	static class Dispatcher extends Transaction {
		private Criteria criteria;
		private String provider;
		private String reference;
		private UhudInterface port;
		private MessageHeaderCT header;
		private TransactionSubTypeST type;

		public Dispatcher(Criteria criteria, String provider) {
			this.criteria = criteria;
			this.provider = provider;
			this.type = TransactionSubTypeST.SUMMARY;
		}

		public Dispatcher(Criteria criteria, String provider, String reference) {
			this.criteria = criteria;
			this.provider = provider;
			this.reference = reference;
			this.type = TransactionSubTypeST.DETAIL;
		}

		public Dispatcher port(UhudInterface port) {
			this.port = port;
			return this;
		}

		public Result dispatch() throws Exception {
			TransactionWrapper req = new TransactionWrapper();
			GregorianCalendar timeStamp = new GregorianCalendar();
			req.setCommonMessageHeader(createHeader(timeStamp));
			req.setApprovalInquiryRequest(createPayload());
			TransactionWrapper result = port.submitSchema(req);
			return parse(result);
		}

		private Result parse(TransactionWrapper result) {
			header = result.getCommonMessageHeader();
			if (null != result.getErrorResponse()
					&& !result.getErrorResponse().isEmpty()) {
				return parse(result.getErrorResponse());
			} else {
				return parse(result.getApprovalInquiryResponse());
			}
		}

		private Result parse(List<ErrorResponseCT> errors) {
			String message = "";
			for (ErrorResponseCT error : errors) {
				message = error.getErrorDescription();
				break;
			}
			return new Result(Result.Outcome.FAILURE, message);
		}

		private Result parse(ApprovalInquiryResponseCT res) {
			if (type == TransactionSubTypeST.SUMMARY) {
				return parse(res.getSummaryResponse());
			} else if (type == TransactionSubTypeST.DETAIL) {
				return parse(res.getDetailResponse());
			}
			return new Result.NoResult("Invalid transaction");
		}

		private Result parse(ApprovalDetailResponseCT detail) {
			if (null == detail.getApprovalResponse()) {
				return new Result.NoResult("Empty response returned from payer");
			}
			if (null == detail.getApprovalResponse().getStatus()) {
				return new Result.NoResult("Empty response returned from payer");
			}
			// invalid
			StatusCT status = detail.getApprovalResponse().getStatus();
			if (status.getStatusCode() == StatusCodeST.INVALID) {
				return new Result.NoResult(status.getStatusDescription());
			}
			return new ApprovalResult(status.getStatusCode().value(),
					status.getStatusDescription(), status.getReferenceNumber(),
					detail.getApprovalResponse().getSubmissionDate());
		}

		private Result parse(ApprovalSummaryResponseCT summary) {
			if (summary.getStatus().getStatusCode() != StatusCodeST.VALID) {
				return new Result.NoResult(summary.getStatus()
						.getStatusDescription());
			}
			// valid but not
			if (null == summary.getApprovalList()
					|| null == summary.getApprovalList().getApprovalLine()
					|| summary.getApprovalList().getApprovalLine().size() == 0) {
				return new Result.NoResult(
						"Sorry, there are no approvals for this member during the specified period.");
			}
			// valid but not
			ApprovalLineCT node = summary.getApprovalList().getApprovalLine()
					.get(0);
			if (null == node || null == node.getApprovalNumber()
					|| node.getApprovalNumber().isEmpty()) {
				return new Result.NoResult(
						"Sorry, there are no approvals for this member during the specified period.");
			}
			return new ApprovalResult(node.getStatusCode().value(),
					"Following approval is found for the specified date "
							+ getStartDate(), node.getApprovalNumber(),
					node.getSubmissionDate());
		}

		private String getStartDate() {
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			try {
				return df.format(criteria.getPayload().getStart().getTime());
			} catch (Exception e) {
				GregorianCalendar cal = new GregorianCalendar();
				return df.format(cal.getTime());
			}
		}

		private ApprovalInquiryRequestCT createPayload()
				throws DatatypeConfigurationException, ParseException {
			ApprovalInquiryRequestCT payload = new ApprovalInquiryRequestCT();

			if (type == TransactionSubTypeST.SUMMARY) {
				payload.setCriteria(new ApprovalCriteriaCT());
				payload.getCriteria().setStartDate(
						DatatypeFactory.newInstance().newXMLGregorianCalendar(
								criteria.getPayload().getStart()));
				payload.getCriteria().setEndDate(
						DatatypeFactory.newInstance().newXMLGregorianCalendar(
								criteria.getPayload().getEnd()));
				payload.getCriteria().setMemberID(criteria.getCard().getNo());
				payload.getCriteria().setPolicyNumber(
						criteria.getCard().getPolicy());

			} else if (type == TransactionSubTypeST.DETAIL) {
				payload.setApprovalReference(new ApprovalReference());
				payload.getApprovalReference().setApprovalNumber(reference);
			}
			return payload;
		}

		private MessageHeaderCT createHeader(GregorianCalendar timeStamp)
				throws DatatypeConfigurationException {
			return super.createHeader(timeStamp, provider, criteria.getCard()
					.getPayer(), TransactionTypeST.VALUE_3, type);
		}
	}
}
