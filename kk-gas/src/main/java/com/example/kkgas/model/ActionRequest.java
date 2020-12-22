package com.example.kkgas.model;

public class ActionRequest {
	/** Response ID */
	private String responseId;

	/** QueryResult model */
	private QueryResult queryResult;
	
	/** OriginalDetectIntentRequest model */
	private OriginalDetectIntentRequest originalDetectIntentRequest;

	/** Session ID */
	private String session;
	

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public QueryResult getQueryResult() {
		return queryResult;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
		return originalDetectIntentRequest;
	}

	public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
		this.originalDetectIntentRequest = originalDetectIntentRequest;
	}
	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}
	
	public ActionRequest(String responseId, QueryResult queryResult,
			OriginalDetectIntentRequest originalDetectIntentRequest, String session) {
		super();
		this.responseId = responseId;
		this.queryResult = queryResult;
		this.originalDetectIntentRequest = originalDetectIntentRequest;
		this.session = session;
	}
	public ActionRequest() {
		
	}
	

}
