package com.example.kkgas.model;

public class Intent {
	/** Intent name */
	private String name;

	/** Intent display name */
	private String displayName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Intent(String name, String displayName) {
		super();
		this.name = name;
		this.displayName = displayName;
	}
	public Intent() {
		
	}
}
