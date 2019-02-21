package com.mobility.boundary;

public enum RelativePath {

	ELIGIBILITY_CHECK("/check"), APPROVAL_INQUIRY("/inquire"), APPROVAL_DETAILS(""),
	DETAILS("/details"), NEXT_PAGE("");
	
	private final String value;

	private RelativePath(String value) {
		this.value = value;
	}

	public String value() {
		return this.value;
	}
}

