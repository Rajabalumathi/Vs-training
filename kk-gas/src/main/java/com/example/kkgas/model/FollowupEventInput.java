package com.example.kkgas.model;

import java.util.Map;

public class FollowupEventInput {
	/** FollowUpEvent name */
	private String name;

	/** Language code */
	private String languageCode;

	/** Parameters map */
	private Map<String, Object> parameters;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	public FollowupEventInput(String name, String languageCode, Map<String, Object> parameters) {
		super();
		this.name = name;
		this.languageCode = languageCode;
		this.parameters = parameters;
	}

	public FollowupEventInput() {

	}
}
