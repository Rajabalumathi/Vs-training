package com.example.kkgas.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Text {
	@JsonProperty("text")
	private List<String> textName;

	public List<String> getTextName() {
		return textName;
	}

	public void setTextName(List<String> textName) {
		this.textName = textName;
	}

	public Text(List<String> textName) {
		super();
		this.textName = textName;
	}

	public Text() {

	}
}
