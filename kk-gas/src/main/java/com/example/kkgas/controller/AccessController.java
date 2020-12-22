package com.example.kkgas.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kkgas.Utils.ApplicationUtils;
import com.example.kkgas.constant.ApplicationConstants;
import com.example.kkgas.entity.Access;
import com.example.kkgas.model.ActionRequest;
import com.example.kkgas.model.ActionResponse;
import com.example.kkgas.service.AuthenticationService;
import com.example.kkgas.service.GasService;

import javax.ws.rs.core.Response;

@RestController
@RequestMapping(value = "/kk")
public class AccessController {
	@Autowired
	AuthenticationService authenticationService;

	@Autowired
	GasService gasService;

	/**
	 * @PostMapping("/home/{accessName}") public String checkAccess(@PathVariable
	 * String accessName) { return service.getDescp(accessName); }
	 * 
	 * @GetMapping("/welcome") public void add() { Access a = new Access("admin",
	 * "Gas Amount Entry"); service.createAccess(a); Access ab = new
	 * Access("Customer", "Gas Booking"); service.createAccess(ab); }
	 **/

	@PostMapping(value = "/gasbooking")
	public ResponseEntity<Object> getGas(@RequestBody final ActionRequest actionRequest,
			@RequestHeader Map<String, String> header) {
		String intentName = actionRequest.getQueryResult().getIntent().getDisplayName();
		ActionResponse actionResponse = null;

		Response response = authenticationService.validateRequest(header);
		boolean isValidIdToken = authenticationService.verifyToken(actionRequest);

		if ((response.getStatus() == HttpStatus.OK.value()) && isValidIdToken) {
			switch (intentName) {
			case ApplicationConstants.ACCESS_TYPE_INTENT:
				actionResponse = gasService.getAccessDescription(actionRequest);
				break;

			case ApplicationConstants.ADMIN_GAS_ENTRY_INTENT:
				actionResponse = gasService.gasEntry(actionRequest);
				break;

			case ApplicationConstants.CUSTOMER_BOOKING_INTENT:
				actionResponse = gasService.getAmount(actionRequest);
				break;
			case ApplicationConstants.BOOKING_CONFIRMATION_INTENT:
				actionResponse = gasService.updateGas(actionRequest);
				break;
			}
			return new ResponseEntity<>(actionResponse, HttpStatus.OK);
		} else {
			return (!isValidIdToken)
					? new ResponseEntity<>(ApplicationUtils.getInvalidTokenResponse(), HttpStatus.UNAUTHORIZED)
					: new ResponseEntity<>(HttpStatus.UNAUTHORIZED);

		}

	}
}
