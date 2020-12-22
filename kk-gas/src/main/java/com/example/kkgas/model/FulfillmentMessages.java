package com.example.kkgas.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FulfillmentMessages {
	/** Platform name */
	private String platform;

	/** Simple Responses */
	@JsonProperty("simpleResponses")
	private Responses simpleResponses;

	/** Text message */
	private Text text;

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Responses getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(Responses simpleResponses) {
		this.simpleResponses = simpleResponses;
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public FulfillmentMessages(String platform, Responses simpleResponses, Text text) {
		super();
		this.platform = platform;
		this.simpleResponses = simpleResponses;
		this.text = text;
	}

	public FulfillmentMessages() {

	}

}
