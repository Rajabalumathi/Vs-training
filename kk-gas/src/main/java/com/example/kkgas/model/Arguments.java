package com.example.kkgas.model;

public class Arguments {
	/** Raw text message */
	private String rawText;

	/** Value of the text */
	private String textValue;

	/** Argument name */
	private String name;

	public String getRawText() {
		return rawText;
	}

	public void setRawText(String rawText) {
		this.rawText = rawText;
	}

	public String getTextValue() {
		return textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Arguments(String rawText, String textValue, String name) {
		super();
		this.rawText = rawText;
		this.textValue = textValue;
		this.name = name;
	}
	
	public Arguments() {
		
	}
	
}
