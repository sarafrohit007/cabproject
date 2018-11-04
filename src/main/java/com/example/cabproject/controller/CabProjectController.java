package com.example.cabproject.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.cabproject.dto.response.UberAuthResponse;
import com.example.cabproject.service.IAuthTokenService;

@Controller
@RequestMapping("/api")
public class CabProjectController {
	
	@Autowired
	IAuthTokenService authTokenService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/firsturl")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<String> createNewScheme() {
		String message = "Success";
		return ResponseEntity.ok().body(message);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/secondurl")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<String> createSecondScheme() {
		String bearertoken = authTokenService.getAuthToken();
		return ResponseEntity.ok().body(bearertoken);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/thirdurl")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<String> createThirdScheme() {
		String message = "Success";
		return ResponseEntity.ok().body(message);
	}
	
	@RequestMapping(method=RequestMethod.GET ,value = "/fourthUrl")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<UberAuthResponse> createFourthScheme(@RequestParam(value="code") String code1) {
		String code = code1;
		System.out.println("Printing code1 "+code);
		UberAuthResponse response = authTokenService.getAuthToken1(code);
		return ResponseEntity.ok().body(response);
	}
	
	@RequestMapping(method=RequestMethod.POST ,value = "/fourthUrl")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<String> createFifthhScheme(UberAuthResponse uberAuthResponse) {
		String response = uberAuthResponse.toString();
		return ResponseEntity.ok().body(response);
	}
	
}
