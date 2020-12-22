package com.example.kkgas.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Google implements Serializable{
	
	/**
	 * The Serial version UID
	 */
	private static final long serialVersionUID = 1L;
	
	/** Check for user response */
	private boolean expectUserResponse;

	/** RichResponse model */
	private RichResponse richResponse;

	/** SystemIntent model */
	private SystemIntent systemIntent;
	
	private String userStorage;

	public boolean isExpectUserResponse() {
		return expectUserResponse;
	}

	public void setExpectUserResponse(boolean expectUserResponse) {
		this.expectUserResponse = expectUserResponse;
	}

	public RichResponse getRichResponse() {
		return richResponse;
	}

	public void setRichResponse(RichResponse richResponse) {
		this.richResponse = richResponse;
	}

	public SystemIntent getSystemIntent() {
		return systemIntent;
	}

	public void setSystemIntent(SystemIntent systemIntent) {
		this.systemIntent = systemIntent;
	}

	public String getUserStorage() {
		return userStorage;
	}

	public void setUserStorage(String userStorage) {
		this.userStorage = userStorage;
	}

	public Google(boolean expectUserResponse, RichResponse richResponse, SystemIntent systemIntent,
			String userStorage) {
		super();
		this.expectUserResponse = expectUserResponse;
		this.richResponse = richResponse;
		this.systemIntent = systemIntent;
		this.userStorage = userStorage;
	}

	public Google() {
		
	}
	

}
