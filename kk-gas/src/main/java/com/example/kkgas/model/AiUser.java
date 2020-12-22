package com.example.kkgas.model;

public class AiUser {
	/** User last seen */
	private String lastSeen;

	/** User locale */
	private String locale;

	/** User Id */
	private String userId;

	/** Google id token */
	private String idToken;

	/** User storage */
	private String userStorage;

	/** User verification status */
	private String userVerificationStatus;

	public String getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(String lastSeen) {
		this.lastSeen = lastSeen;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getIdToken() {
		return idToken;
	}

	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}

	public String getUserStorage() {
		return userStorage;
	}

	public void setUserStorage(String userStorage) {
		this.userStorage = userStorage;
	}

	public String getUserVerificationStatus() {
		return userVerificationStatus;
	}

	public void setUserVerificationStatus(String userVerificationStatus) {
		this.userVerificationStatus = userVerificationStatus;
	}

	public AiUser(String lastSeen, String locale, String userId, String idToken, String userStorage,
			String userVerificationStatus) {
		super();
		this.lastSeen = lastSeen;
		this.locale = locale;
		this.userId = userId;
		this.idToken = idToken;
		this.userStorage = userStorage;
		this.userVerificationStatus = userVerificationStatus;
	}
	public AiUser() {
		
	}
	
}
