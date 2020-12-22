package com.example.kkgas.model;

import java.util.Map;

public class OutputContexts {

	/** Context name */
	private String name;

	/** Lifespan of the context */
	private int lifespanCount;

	/** Parameter map */
	private Map<String, Object> parameters;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifespanCount() {
		return lifespanCount;
	}

	public void setLifespanCount(int lifespanCount) {
		this.lifespanCount = lifespanCount;
	}

	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	public OutputContexts(String name, int lifespanCount, Map<String, Object> parameters) {
		super();
		this.name = name;
		this.lifespanCount = lifespanCount;
		this.parameters = parameters;
	}

	public OutputContexts() {

	}
}
