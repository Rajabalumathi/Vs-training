package com.example.kkgas.model;

public class OriginalDetectIntentRequest {
	/** source name */
	private String source;

	/** Version */
	private String version;

	/** Payload model */
	private Payload payload;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	
	public OriginalDetectIntentRequest(String source, String version, Payload payload) {
		super();
		this.source = source;
		this.version = version;
		this.payload = payload;
	}
	public OriginalDetectIntentRequest() {
		
	}
}
