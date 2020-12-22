package com.example.kkgas.model;

import java.util.List;


public class Payload {
	/** User model */
	private AiUser user;

	/** Conversation model */
	private Conversation conversation;

	/** List of Inputs */
	private List<Inputs> inputs;

	/** Surface model */
	private Surface surface;

	/** check for sandbox */
	private boolean isInSandbox;

	/** List of AvailableSurfaces */
	private List<AvailableSurfaces> availableSurfaces;

	/** Request Type */
	private String requestType;

	public AiUser getUser() {
		return user;
	}

	public void setUser(AiUser user) {
		this.user = user;
	}

	public Conversation getConversation() {
		return conversation;
	}

	public void setConversation(Conversation conversation) {
		this.conversation = conversation;
	}

	public List<Inputs> getInputs() {
		return inputs;
	}

	public void setInputs(List<Inputs> inputs) {
		this.inputs = inputs;
	}

	public Surface getSurface() {
		return surface;
	}

	public void setSurface(Surface surface) {
		this.surface = surface;
	}

	public boolean isInSandbox() {
		return isInSandbox;
	}

	public void setInSandbox(boolean isInSandbox) {
		this.isInSandbox = isInSandbox;
	}

	public List<AvailableSurfaces> getAvailableSurfaces() {
		return availableSurfaces;
	}

	public void setAvailableSurfaces(List<AvailableSurfaces> availableSurfaces) {
		this.availableSurfaces = availableSurfaces;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public Payload(AiUser user, Conversation conversation, List<Inputs> inputs, Surface surface, boolean isInSandbox,
			List<AvailableSurfaces> availableSurfaces, String requestType) {
		super();
		this.user = user;
		this.conversation = conversation;
		this.inputs = inputs;
		this.surface = surface;
		this.isInSandbox = isInSandbox;
		this.availableSurfaces = availableSurfaces;
		this.requestType = requestType;
	}
	public Payload() {
		
	}
}
