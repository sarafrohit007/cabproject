package com.example.cabproject.clientService.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.cabproject.clientService.ICommuterclient;
import com.example.cabproject.enums.ClientEnum;

@Service("uberClient")
@Qualifier("uberClient")
public class UberClient implements ICommuterclient{

	@Override
	public UberClient returnClient(String clientType) {
		if(clientType.equals(ClientEnum.UBER_GET_ME.getUrlType())){
			
		}
		return null;
	}
	
	

}
