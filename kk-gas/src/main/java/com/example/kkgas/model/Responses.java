package com.example.kkgas.model;

import java.util.List;


public class Responses {
	/** List of Simple Responses */
	private List<SimpleResponse> simpleResponses;
	
	public List<SimpleResponse> getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(List<SimpleResponse> simpleResponses) {
		this.simpleResponses = simpleResponses;
	}

	public Responses(List<SimpleResponse> simpleResponses) {
		super();
		this.simpleResponses = simpleResponses;
	}
	
	public Responses() {
		
	}
}
