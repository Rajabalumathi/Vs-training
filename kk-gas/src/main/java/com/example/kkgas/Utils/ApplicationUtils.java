package com.example.kkgas.Utils;

import org.springframework.http.HttpStatus;

import com.example.kkgas.constant.ApplicationConstants;
import com.example.kkgas.exception.ApiError;

public class ApplicationUtils {
	public static ApiError getInvalidTokenResponse() {
		return new ApiError(HttpStatus.UNAUTHORIZED.toString(), ApplicationConstants.INVALID_ID_TOKEN,
				HttpStatus.UNAUTHORIZED);
	}
}
