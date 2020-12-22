package com.example.kkgas.service;

import java.util.Collections;
import java.util.Map;
import java.util.StringTokenizer;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.kkgas.constant.ApplicationConstants;
import com.example.kkgas.model.ActionRequest;
import com.example.kkgas.model.AiUser;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import org.apache.commons.codec.binary.Base64;


@Service
public class AuthenticationService {
	/** Static logger object for this class. */
	private static final Logger LOG = LoggerFactory.getLogger(AuthenticationService.class);
	
	/** Google's client Id */
	@Value("${app.google.client.id}")
	private String clientId;
	
	/** Dialogflow User */
	@Value("${app.df.user}")
	private String basicAuthUsername;
	
	/** Dialogflow PWD */
	@Value("${app.df.pwd}")
	private String basicAuthPassword;
	
	/**
	 * To Verify userid token is valid or not
	 * @param actionRequest
	 * @return
	 */
	public boolean verifyToken(final ActionRequest actionRequest) {
		boolean isValid = false;
		AiUser user = actionRequest.getOriginalDetectIntentRequest().getPayload().getUser();
		if (user.getIdToken() == null) {
			isValid = true;
		} else {
			try {
				NetHttpTransport transport = GoogleNetHttpTransport.newTrustedTransport();
				JacksonFactory jsonFactory = JacksonFactory.getDefaultInstance();
				GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(transport, jsonFactory)
						.setAudience(Collections.singletonList(clientId)).build();
				GoogleIdToken googleIdToken = verifier.verify(user.getIdToken());
				isValid = (googleIdToken == null) ? Boolean.FALSE : Boolean.TRUE;
				LOG.info("verifyToken : {}" , isValid);
			} catch (Exception e) {
				LOG.error("verifyToken:EXCEPTION ———— " + e.getMessage());
			}
		}
		return isValid;
	}
	
	/**
	 * To validate the dialogflow request
	 * @param header
	 * @return
	 */
	public Response validateRequest(final Map<String, String> header) {
		
		LOG.info("validateRequest:HEADER ———— {}" , header);
		ResponseBuilder builder = Response.status(Response.Status.BAD_REQUEST);

		String authHeader = header.get(ApplicationConstants.DF_HEADER_AUTHORIZATION);
		
		try {
			if (authHeader != null && !authHeader.isEmpty()) {
				String authToken = authHeader.replaceFirst(ApplicationConstants.HEADER_AUTHORIZATION_BASIC, "");
				StringTokenizer tokenizer = new StringTokenizer(new String(Base64.decodeBase64(authToken)), ":");
				String username = tokenizer.nextToken();
				String password = tokenizer.nextToken();
				if (basicAuthUsername.equals(username) && basicAuthPassword.equals(password)) {
					builder.status(Response.Status.OK);
					LOG.info("validateRequest : verified");
				} else {
					builder.status(Response.Status.UNAUTHORIZED);
				}
			}
		} catch (Exception e) {
			LOG.error("validateRequest:EXCEPTION ———— " + e.getMessage());
		}
		
		return builder.build();
	}
}
