package com.example.kkgas.model;

import java.util.List;
import java.util.Map;

public class QueryResult {
	/** Query text */
	private String queryText;

	/** Action name */
	private String action;

	/** Parameters map */
	private Map<String, Object> parameters;

	/** Check for required params */
	private boolean allRequiredParamsPresent;

	/** List of FulfillmentMessages */
	private List<FulfillmentMessages> fulfillmentMessages;

	/** List of OutputContexts */
	private List<OutputContexts> outputContexts;

	/** Intent model */
	private Intent intent;
	
	/** IntentDetectionConfidence */
	private float intentDetectionConfidence;

	/** Language code */
	private String languageCode;

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	public boolean isAllRequiredParamsPresent() {
		return allRequiredParamsPresent;
	}

	public void setAllRequiredParamsPresent(boolean allRequiredParamsPresent) {
		this.allRequiredParamsPresent = allRequiredParamsPresent;
	}

	public List<FulfillmentMessages> getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	public void setFulfillmentMessages(List<FulfillmentMessages> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	public List<OutputContexts> getOutputContexts() {
		return outputContexts;
	}

	public void setOutputContexts(List<OutputContexts> outputContexts) {
		this.outputContexts = outputContexts;
	}

	public Intent getIntent() {
		return intent;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	public float getIntentDetectionConfidence() {
		return intentDetectionConfidence;
	}

	public void setIntentDetectionConfidence(float intentDetectionConfidence) {
		this.intentDetectionConfidence = intentDetectionConfidence;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public QueryResult(String queryText, String action, Map<String, Object> parameters,
			boolean allRequiredParamsPresent, List<FulfillmentMessages> fulfillmentMessages,
			List<OutputContexts> outputContexts, Intent intent, float intentDetectionConfidence, String languageCode) {
		super();
		this.queryText = queryText;
		this.action = action;
		this.parameters = parameters;
		this.allRequiredParamsPresent = allRequiredParamsPresent;
		this.fulfillmentMessages = fulfillmentMessages;
		this.outputContexts = outputContexts;
		this.intent = intent;
		this.intentDetectionConfidence = intentDetectionConfidence;
		this.languageCode = languageCode;
	}

	public QueryResult() {
		
	}
	
}
