package com.example.kkgas.model;

import java.util.Map;

public class AiPayload {
	/** Google model */
	private Google google;

	/** Conversation data map */
	private Map<String, Object> conversationData;

	public Google getGoogle() {
		return google;
	}

	public void setGoogle(Google google) {
		this.google = google;
	}

	public Map<String, Object> getConversationData() {
		return conversationData;
	}

	public void setConversationData(Map<String, Object> conversationData) {
		this.conversationData = conversationData;
	}

	public AiPayload(Google google, Map<String, Object> conversationData) {
		super();
		this.google = google;
		this.conversationData = conversationData;
	}
	public AiPayload() {
		
	}

}
