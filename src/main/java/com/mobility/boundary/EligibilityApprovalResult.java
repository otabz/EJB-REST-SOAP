package com.mobility.boundary;

public class EligibilityApprovalResult {

	private Result eligibility;
	private Result approval;

	public EligibilityApprovalResult(Result eligibility, Result approval) {
		this.eligibility = eligibility;
		this.approval = approval;
	}

	public Result getEligibility() {
		return eligibility;
	}

	public Result getApproval() {
		return approval;
	}

	public static class NoResult extends EligibilityApprovalResult {

		public NoResult(String message) {
			super(new Result.NoResult(message), new Result.NoResult(message));
		}

		public NoResult() {
			this("Oops! Something crashed. Please, try again.");
		}
	}
}
