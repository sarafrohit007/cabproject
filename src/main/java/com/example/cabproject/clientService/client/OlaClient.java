package com.example.cabproject.clientService.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.cabproject.clientService.ICommuterclient;

@Service("olaClient")
@Qualifier("olaClient")
public class OlaClient implements ICommuterclient{

	@Override
	public OlaClient returnClient(String clientType) {
		
		return null;
	}

}
