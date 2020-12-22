package com.example.kkgas.model;

import java.util.List;

public class Inputs {
	/** List of Raw Inputs */
	private List<RawInputs> rawInputs;

	/** List of Arguments */
	private List<Arguments> arguments;

	/** Intent name */
	private String intent;

	public List<RawInputs> getRawInputs() {
		return rawInputs;
	}

	public void setRawInputs(List<RawInputs> rawInputs) {
		this.rawInputs = rawInputs;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public Inputs(List<RawInputs> rawInputs, List<Arguments> arguments, String intent) {
		super();
		this.rawInputs = rawInputs;
		this.arguments = arguments;
		this.intent = intent;
	}
	public Inputs() {
		
	}
}
