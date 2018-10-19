package com.example.cabproject.clientService.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.cabproject.clientService.ICommuterclient;

@Service("uberClient")
@Qualifier("uberClient")
public class UberClient implements ICommuterclient{
	
	

}
