package com.example.cabproject.clientService;

import com.example.cabproject.dto.request.IClientRequest;

public interface ICommuterclient {
	
	ICommuterclient returnClient(String clientType,IClientRequest clientRequest);

}
