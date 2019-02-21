package com.mobility.boundary;

import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import com.mobility.boundary.EligibilityResult.Member;
import com.mobility.boundary.EligibilityResult.Policy;
import com.waseel.DepartmentCodeST;
import com.waseel.EligibilitySubmissionReponseCT;
import com.waseel.EligibilitySubmissionRequestCT;
import com.waseel.ErrorResponseCT;
import com.waseel.MemberCT;
import com.waseel.MemberInfoCT;
import com.waseel.MessageHeaderCT;
import com.waseel.StatusCodeST;
import com.waseel.TransactionSubTypeST;
import com.waseel.TransactionTypeST;
import com.waseel.TransactionWrapper;
import com.waseel.UhudInterface;
import com.waseel.VisitInfoCT;
import com.waseel.VisitTypeST;

public class Eligibility {

	private Eligibility() {
	}

	static class Dispatcher extends Transaction {
		private Credentials creds;
		private String provider;
		private UhudInterface port;
		private MessageHeaderCT header;

		public Dispatcher(Credentials creds, String provider) {
			this.creds = creds;
			this.provider = provider;
		}

		public Dispatcher port(UhudInterface port) {
			this.port = port;
			return this;
		}

		public Result dispatch() throws Exception {
			TransactionWrapper req = new TransactionWrapper();
			GregorianCalendar timeStamp = new GregorianCalendar();
			req.setCommonMessageHeader(createHeader(timeStamp));
			req.setEligibilitySubmissionRequest(createPayload(timeStamp));
			TransactionWrapper result = port.submitSchema(req);
			return parse(result);
		}

		private Result parse(TransactionWrapper result) {
			header = result.getCommonMessageHeader();
			if (null != result.getErrorResponse()
					&& !result.getErrorResponse().isEmpty()) {
				return parse(result.getErrorResponse());
			} else {
				return parse(result.getEligibilitySubmissionResponse());
			}
		}

		private Result parse(List<ErrorResponseCT> errors) {
			String message = "";
			for (ErrorResponseCT error : errors) {
				message = error.getErrorDescription();
				break;
			}
			if (null != message
					&& (message.toLowerCase().contains("member") || message
							.toLowerCase().contains("policy"))) {
				return new EligibilityResult(StatusCodeST.INVALID.value(), "", -1f,
						"", "", header.getTimestamp(), null, null, message);
			}
			return new Result(Result.Outcome.FAILURE, message);
		}

		private EligibilityResult parse(EligibilitySubmissionReponseCT res) {
			BigDecimal shareAmount = null;
			String shareType = null;
			if (res.getCoverageInfo() != null
					&& res.getCoverageInfo().getBenefit() != null
					&& res.getCoverageInfo().getBenefit().size() > 0
					&& res.getCoverageInfo().getBenefit().get(0)
							.getPatientShare() != null) {
				shareAmount = res.getCoverageInfo().getBenefit().get(0)
						.getPatientShare().getValue();
				shareType = res.getCoverageInfo().getBenefit().get(0)
						.getPatientShare().getType() != null ? res
						.getCoverageInfo().getBenefit().get(0)
						.getPatientShare().getType().value() : shareType;
			}

			String status = res.getStatus().getStatusCode().value();
			String denialCode = res.getStatus().getDenialCode();
			String reference = res.getStatus().getReferenceNumber();
			String message = res.getStatus().getStatusDescription();
			XMLGregorianCalendar date = res.getRequestedData()
					.getVisitInformation().getVisitDate();
			Policy policy = parsePolicy(res.getMemberInfo());
			Member member = parseMember(res.getMemberInfo());
			
			return new EligibilityResult(status, denialCode, shareAmount!=null?shareAmount.floatValue():0.0f,
					shareType, reference, date, policy, member, message);
		}
		
		private Policy parsePolicy(MemberInfoCT memberInfo) {
			Policy policy = new Policy();
			if (memberInfo == null) {
				return null;
			}
			if (memberInfo.getPolicyType() != null) {
				policy.setPolicyType(memberInfo.getPolicyType().name());
			}
			if (memberInfo.getPolicyHolderName() != null && !memberInfo.getPolicyHolderName().isEmpty()) {
				policy.setPolicyHolder(memberInfo.getPolicyHolderName());
			}
			if (memberInfo.getEndDate() != null) {
				policy.setEndDate(memberInfo.getEndDate());
			}
			if (memberInfo.getStartDate() != null) {
				policy.setStartDate(memberInfo.getStartDate());
			}
			return policy;
		}
		
		private Member parseMember(MemberInfoCT memberInfo) {
			if (memberInfo == null) {
				return null;
			}
			Member member = new Member();
			if (memberInfo.getFullName() != null && !memberInfo.getFullName().isEmpty()) {
				member.setName(memberInfo.getFullName());
			}
			if (memberInfo.getGender() != null) {
				member.setGender(memberInfo.getGender().name());
			}
			if (memberInfo.getMaritalStatus() != null) {
				member.setMaritalStatus(memberInfo.getMaritalStatus().name());
			}
			if (memberInfo.getMemberClass() != null && !memberInfo.getMemberClass().isEmpty()) {
				member.setMemberClass(memberInfo.getMemberClass());
			}
			if (memberInfo.getMemberType() != null) {
				member.setMemberType(memberInfo.getMemberType().name());
			}
			if (memberInfo.getDOB() != null) {
				member.setDob(memberInfo.getDOB());
			}
			return member;
		}

		private MessageHeaderCT createHeader(GregorianCalendar timeStamp)
				throws DatatypeConfigurationException {
			return super.createHeader(timeStamp, provider, creds.getCard()
					.getPayer(), TransactionTypeST.VALUE_1,
					TransactionSubTypeST.NEW);
		}

		private EligibilitySubmissionRequestCT createPayload(
				GregorianCalendar timeStamp)
				throws DatatypeConfigurationException {
			EligibilitySubmissionRequestCT payload = new EligibilitySubmissionRequestCT();
			payload.setMember(new MemberCT());
			payload.getMember().setMemberID(creds.getCard().getNo());
			payload.getMember().setPolicyNumber(creds.getCard().getPolicy());
			payload.setVisitInformation(new VisitInfoCT());
			payload.getVisitInformation().setDepartmentCode(
					DepartmentCodeST.fromValue(creds.getPayload()
							.getDepartment()));
			payload.getVisitInformation().setVisitType(VisitTypeST.NEW);
			payload.getVisitInformation().setVisitDate(
					DatatypeFactory.newInstance().newXMLGregorianCalendar(
							timeStamp));
			return payload;
		}
	}
}
