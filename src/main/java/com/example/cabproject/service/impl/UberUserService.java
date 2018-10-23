package com.example.cabproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.cabproject.clientService.ICommuterclient;
import com.example.cabproject.clientService.client.UberClient;
import com.example.cabproject.service.IUserInformationService;

@Service("uberUserService")
public class UberUserService implements IUserInformationService{

	@Autowired
	@Qualifier("uberClient")
	private ICommuterclient commuterClient;
	
	@Override
	public void getUserInfo() {
		UberClient uberClient = (UberClient) commuterClient.returnClient("user.get.me");
		
	}

}
