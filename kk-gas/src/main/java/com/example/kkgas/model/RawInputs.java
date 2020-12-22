package com.example.kkgas.model;

public class RawInputs {
	/** Query name */
	private String query;

	/** Input type */
	private String inputType;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public RawInputs(String query, String inputType) {
		super();
		this.query = query;
		this.inputType = inputType;
	}

	public RawInputs() {

	}
}
