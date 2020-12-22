package com.example.kkgas.model;

public class SystemIntent {
	/** SystemIntent name */
	private String intent;

	/** Data model */
	private Data data;
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}
}
