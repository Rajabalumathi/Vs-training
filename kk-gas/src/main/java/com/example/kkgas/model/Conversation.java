package com.example.kkgas.model;

import java.util.Map;

public class Conversation {
	/** Conversation Id */
	private String conversationId;

	/** Conversation Type */
	private String type;

	/** Conversation token */
	private String conversationToken;

	/** Conversation data map */
	private Map<String, Object> conversationData;

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getConversationToken() {
		return conversationToken;
	}

	public void setConversationToken(String conversationToken) {
		this.conversationToken = conversationToken;
	}

	public Map<String, Object> getConversationData() {
		return conversationData;
	}

	public void setConversationData(Map<String, Object> conversationData) {
		this.conversationData = conversationData;
	}

	public Conversation(String conversationId, String type, String conversationToken,
			Map<String, Object> conversationData) {
		super();
		this.conversationId = conversationId;
		this.type = type;
		this.conversationToken = conversationToken;
		this.conversationData = conversationData;
	}
	
	public Conversation() {
		
	}
	

}
