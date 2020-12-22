package com.example.kkgas.exception;

import org.springframework.http.HttpStatus;

public class ApiError {
	private String status;
	private String message;
	private HttpStatus error;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getError() {
		return error;
	}

	public void setError(HttpStatus error) {
		this.error = error;
	}

	public ApiError(String status, String message, HttpStatus error) {
		super();
		this.status = status;
		this.message = message;
		this.error = error;
	}

	public ApiError() {

	}

}
