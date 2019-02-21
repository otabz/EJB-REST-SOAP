package com.mobility.boundary;

//import org.codehaus.jackson.annotate.JsonProperty;

public class Credentials {

	// can be extended for others info e.g. location
	public static class Authentication {
		private String token;
		
		public String getToken() {
			return token;
		}
	}
	
	public static class Card {
		private String no;
		private String policy;
		private String payer;

		public String getNo() {
			return no;
		}

		public String getPolicy() {
			return policy;
		}

		public String getPayer() {
			return payer;
		}
	}

	static public class Payload {
		//@JsonProperty("department")
		private String department;

		public String getDepartment() {
			return department;
		}
	}

	//private Authentication authentication;
	private Card card;
	private Payload payload;
	
	public Card getCard() {
		return card;
	}
	public Payload getPayload() {
		return payload;
	}
	/*public Authentication getAuthentication() {
		return authentication;
	}*/
}
