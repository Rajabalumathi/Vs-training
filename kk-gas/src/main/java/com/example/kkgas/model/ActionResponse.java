package com.example.kkgas.model;

import java.util.List;

public class ActionResponse {
	/** Fulfillment text */
	private String fulfillmentText;

	/** List of fulfillmentMessages */
	private List<FulfillmentMessages> fulfillmentMessages;

	/** Source name */
	private String source;

	/** Response payload */
	private AiPayload payload;

	/** List of outputContexts */
	private List<OutputContexts> outputContexts;

	/** FollowUpEvent model */
	private FollowupEventInput followupEventInput;

	public String getFulfillmentText() {
		return fulfillmentText;
	}

	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}

	public List<FulfillmentMessages> getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	public void setFulfillmentMessages(List<FulfillmentMessages> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public AiPayload getPayload() {
		return payload;
	}

	public void setPayload(AiPayload payload) {
		this.payload = payload;
	}

	public List<OutputContexts> getOutputContexts() {
		return outputContexts;
	}

	public void setOutputContexts(List<OutputContexts> outputContexts) {
		this.outputContexts = outputContexts;
	}

	public FollowupEventInput getFollowupEventInput() {
		return followupEventInput;
	}

	public void setFollowupEventInput(FollowupEventInput followupEventInput) {
		this.followupEventInput = followupEventInput;
	}
	
	public ActionResponse(String fulfillmentText, List<FulfillmentMessages> fulfillmentMessages, String source,
			AiPayload payload, List<OutputContexts> outputContexts, FollowupEventInput followupEventInput) {
		super();
		this.fulfillmentText = fulfillmentText;
		this.fulfillmentMessages = fulfillmentMessages;
		this.source = source;
		this.payload = payload;
		this.outputContexts = outputContexts;
		this.followupEventInput = followupEventInput;
	}
	
	public ActionResponse() {
		
	}
}
