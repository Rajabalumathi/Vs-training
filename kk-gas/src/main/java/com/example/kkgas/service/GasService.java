package com.example.kkgas.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kkgas.entity.Access;
import com.example.kkgas.entity.Gas;
import com.example.kkgas.repository.AccessRepository;
import com.example.kkgas.repository.GasRepository;
import com.example.kkgas.model.FollowupEventInput;
import com.example.kkgas.constant.ApplicationConstants;
import com.example.kkgas.model.ActionRequest;
import com.example.kkgas.model.ActionResponse;
import com.example.kkgas.model.OutputContexts;
import com.example.kkgas.model.RichResponse;
import com.example.kkgas.model.SimpleResponse;
import com.example.kkgas.model.AiPayload;
import com.example.kkgas.model.Google;
import com.example.kkgas.model.Items;

@Service
public class GasService {
	@Autowired
	GasRepository gasRepository;

	@Autowired
	AccessRepository accessRepository;

	/**
	 * public boolean add(Integer gasAmount) { return gasRepository.save(new
	 * Gas(gasAmount, false)) != null; }
	 * 
	 * public boolean update() { Gas g = gasRepository.findByGasStatus(false); if (g
	 * != null) { g.setGasStatus(true); return gasRepository.save(g) != null; } else
	 * { return false; } } public Integer fetchAmount() { Gas g =
	 * gasRepository.findByGasStatus(false); return g.getGasAmount(); }
	 **/

	/* To get Amount of gas */
	public ActionResponse getAmount(ActionRequest actionRequest) {
		Gas gas = gasRepository.findByGasStatus(false);
		String text = "Gas amount is " + gas.getGasAmount()+"Say yes for confirm booking";
		return textMessage(text);
	}

	/* To get Access Event */
	public ActionResponse getAccessDescription(ActionRequest actionRequest) {
		String parameter = (String) actionRequest.getQueryResult().getParameters().get("accessType");
		ActionResponse actionResponse = new ActionResponse();
		FollowupEventInput followupEventInput = new FollowupEventInput();
		if (parameter == "customer") {
			followupEventInput.setName(ApplicationConstants.CUSTOMER_ACCESS_TYPE);
		} else {
			followupEventInput.setName(ApplicationConstants.ADMIN_ACCESS_TYPE);
		}
		actionResponse.setFollowupEventInput(followupEventInput);
		return actionResponse;
	}

	/* For Gas Amount Entry */
	public ActionResponse gasEntry(ActionRequest actionRequest) {
		String parameter = (String) actionRequest.getQueryResult().getParameters().get("gasAmount");
		gasRepository.save(new Gas((Integer.parseInt(parameter)), false));
		String text = "Gas Amount is entered as" + parameter;
		return textMessage(text);
	}

	/* Gas Booking */
	public ActionResponse updateGas(ActionRequest actionRequest) {
		Gas gas = gasRepository.findByGasStatus(false);
		if (gas != null) {
			gas.setGasStatus(true);
			gasRepository.save(gas);
			String text = "Gas has Booked and Booked Gas Number is" + gas.getGasId();
			return textMessage(text);
		} else {
			String text = "Gas is out of stock Try after some time";
			return textMessage(text);
		}
	}

	private ActionResponse textMessage(String text) {
		ActionResponse actionResponse = new ActionResponse();
		AiPayload payload = new AiPayload();
		Google google = new Google();
		google.setExpectUserResponse(true);
		RichResponse richResponse = new RichResponse();
		List<Items> itemsList = new ArrayList<>();
		Items items = new Items();
		SimpleResponse simpleResponse = new SimpleResponse();
		simpleResponse.setTextToSpeech(text);
		items.setSimpleResponse(simpleResponse);
		itemsList.add(items);
		richResponse.setItems(itemsList);
		google.setRichResponse(richResponse);
		payload.setGoogle(google);
		actionResponse.setPayload(payload);
		return actionResponse;
	}

}
