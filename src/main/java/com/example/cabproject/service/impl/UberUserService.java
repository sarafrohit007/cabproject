package com.example.cabproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.cabproject.clientService.ICommuterclient;
import com.example.cabproject.clientService.client.UberClient;
import com.example.cabproject.dto.request.IClientRequest;
import com.example.cabproject.dto.request.UberClientRequest;
import com.example.cabproject.service.IUserInformationService;
import com.example.cabproject.utils.SystemConstants;

@Service("uberUserService")
public class UberUserService implements IUserInformationService{

	@Autowired
	@Qualifier("uberClient")
	private ICommuterclient commuterClient;
	
	@Override
	public void getUserInfo() {
		UberClientRequest uberClientRequest = new UberClientRequest();
		UberClient uberClient = (UberClient) commuterClient.returnClient(SystemConstants.UBER_GET_ME_USER_KEYWORD,uberClientRequest);
	}

	@Override
	public void getPlaceByPlaceType() {
		UberClientRequest uberClientRequest = new UberClientRequest();
		UberClient uberClient = (UberClient) commuterClient.returnClient("user.get.me",uberClientRequest);
	}

}
