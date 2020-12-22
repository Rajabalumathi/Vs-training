package com.example.kkgas.model;

import java.util.List;

public class SimpleResponse {

	/** Speech text */
	private String textToSpeech;

	public String getTextToSpeech() {
		return textToSpeech;
	}

	public void setTextToSpeech(String textToSpeech) {
		this.textToSpeech = textToSpeech;
	}

	public SimpleResponse(String textToSpeech) {
		super();
		this.textToSpeech = textToSpeech;
	}

	public SimpleResponse() {

	}

}
