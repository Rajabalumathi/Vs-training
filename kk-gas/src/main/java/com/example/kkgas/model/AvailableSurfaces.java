package com.example.kkgas.model;

import java.util.List;

public class AvailableSurfaces {
	/** List of capabilities */
	private List<Capabilities> capabilities;
	
	public List<Capabilities> getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(List<Capabilities> capabilities) {
		this.capabilities = capabilities;
	}
	
	public AvailableSurfaces(List<Capabilities> capabilities) {
		super();
		this.capabilities = capabilities;
	}
	public AvailableSurfaces() {
		
	}
}
