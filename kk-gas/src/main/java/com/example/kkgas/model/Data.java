package com.example.kkgas.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	/** Type of data */
	@JsonProperty("@type")
	private String type;
	
	/** Context message */
	private String optContext;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOptContext() {
		return optContext;
	}

	public void setOptContext(String optContext) {
		this.optContext = optContext;
	}

	public Data(String type, String optContext) {
		super();
		this.type = type;
		this.optContext = optContext;
	}

	public Data() {
		
	}
}
