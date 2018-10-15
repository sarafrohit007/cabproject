package com.example.cabproject.service;

import com.example.cabproject.dto.response.UberAuthResponse;

public interface IAuthTokenService {
	
	String getAuthToken();

	UberAuthResponse getAuthToken1(String code);

}
