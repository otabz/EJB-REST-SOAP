package com.mobility.boundary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
//import org.codehaus.jackson.annotate.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.waseel.AmountTypeST;

public class EligibilityResult extends Result {
	//@JsonProperty
	private String status = "";
	//@JsonProperty
	private String denialCode = "";
	//@JsonProperty
	private Share share;
	//@JsonProperty
	private String reference = "";
	//@JsonProperty
	private String date = "";
	//@JsonProperty
	private Member member;
	//@JsonProperty
	private Policy policy;
	
	private String desc;

	public EligibilityResult(String status, String denialCode, float shareAmount,
			String shareType, String reference, XMLGregorianCalendar date, Policy policy, Member member, String desc) {
		super(Result.Outcome.SUCCESS, "");
		this.status = status;
		this.denialCode = denialCode;
		this.reference = reference;
		share = new Share(shareAmount, shareType);
		setDate(date);
		this.policy = policy;
		this.member = member;
		this.desc = desc;
		
		if (status.equalsIgnoreCase("INELIGIBLE")) {
			if ("WE-07".equalsIgnoreCase(denialCode)) {
				//this.status = "INVALID";
			} else if ("WE-08".equalsIgnoreCase(denialCode)) {
				//this.status = "INVALID";
			} else if ("WE-09".equalsIgnoreCase(denialCode)) {
				//this.status = "INVALID";
			}
		}
	}

	private void setDate(XMLGregorianCalendar date) {
		DateFormat df = new SimpleDateFormat("dd MMMM yyyy HH:mm");
		this.date = df.format(date.toGregorianCalendar().getTime());
	}

	static class Share {
		private float amount;
		private String type = "";

		public Share(float amount, String type) {
			this.amount = amount;
			this.type = (null == type ? "" : type);
		}

		public String getAmount() {
			if (amount < 0) {
				return "";
			}
			return String.valueOf(amount);
		}

		public String getType() {
			if (AmountTypeST.PERCENT.value().equals(type)) {
				return "%";
			}
			return type;
		}
	}
	
	static class Member {
		private String name = "";
		private String gender = "";
		private String memberType = "";
		private String maritalStatus = "";
		private String memberClass = "";
		private String dob = "";
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			if (null != name) {
			this.name = name;
			}
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			if (null != gender) {
			this.gender = gender;
			}
		}
		public String getMemberType() {
			return memberType;
		}
		public void setMemberType(String memberType) {
			if (null != memberType) {
			this.memberType = memberType;
			}
		}
		public String getMaritalStatus() {
			return maritalStatus;
		}
		public void setMaritalStatus(String maritalStatus) {
			if (null != maritalStatus) {
			this.maritalStatus = maritalStatus;
			}
		}
		public String getDob() {
			return dob;
		}
		public void setDob(XMLGregorianCalendar dob) {
			try {
			DateFormat df = new SimpleDateFormat("dd MMMM yyyy HH:mm");
			this.dob = df.format(dob.toGregorianCalendar().getTime());
			} catch(Exception e) {
				this.dob = "";
			}
		}
		public String getMemberClass() {
			return memberClass;
		}
		public void setMemberClass(String memberClass) {
			if (null != memberClass) {
			this.memberClass = memberClass;
			}
		}
	}
	
	static class Policy {
		private String policyType = "";
		private String policyHolder = "";
		private String startDate = "";
		private String endDate = "";
		
		public String getPolicyType() {
			return policyType;
		}
		public void setPolicyType(String policyType) {
			if (null != policyType) {
			this.policyType = policyType;
			}
		}
		public String getPolicyHolder() {
			return policyHolder;
		}
		public void setPolicyHolder(String policyHolder) {
			if (null != policyHolder) {
			this.policyHolder = policyHolder;
			}
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(XMLGregorianCalendar startDate) {
			try {
			DateFormat df = new SimpleDateFormat("dd MMMM yyyy HH:mm");
			this.startDate = df.format(startDate.toGregorianCalendar().getTime());
			} catch(Exception e) {
				this.startDate = "";
			}
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(XMLGregorianCalendar endDate) {
			try {
			DateFormat df = new SimpleDateFormat("dd MMMM yyyy HH:mm");
			this.endDate = df.format(endDate.toGregorianCalendar().getTime());
			} catch(Exception e) {
				this.endDate = "";
			}
		}
	}
	
	public String getStatus() {
		return this.status;
	}

	public String getDenialCode() {
		return denialCode;
	}

	public Share getShare() {
		return share;
	}

	public String getReference() {
		return reference;
	}

	public String getDate() {
		return date;
	}

	public Member getMember() {
		return member;
	}

	public Policy getPolicy() {
		return policy;
	}

	public String getDesc() {
		return desc;
	}
	
	/*static class Benefit {
		private String description;
		private Share patientShare;
		private Share approvalThreshold;
		private boolean approvalLimit;
		
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Share getPatientShare() {
			return patientShare;
		}
		public void setPatientShare(Share patientShare) {
			this.patientShare = patientShare;
		}
		public Share getApprovalThreshold() {
			return approvalThreshold;
		}
		public void setApprovalThreshold(Share approvalThreshold) {
			this.approvalThreshold = approvalThreshold;
		}
		public boolean isApprovalLimit() {
			return approvalLimit;
		}
		public void setApprovalLimit(boolean approvalLimit) {
			this.approvalLimit = approvalLimit;
		}
	}*/
}
