package com.example.cabproject.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class CabProjectController {
	
	@RequestMapping(method = RequestMethod.POST, value = "/firsturl")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<String> createNewScheme() {
		System.out.println("Inside Successful Response 1......");
		String message = "Success";
		return ResponseEntity.ok().body(message);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/secondurl")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<String> createSecondScheme() {
		System.out.println("Inside Successful Response 2......");
		String message = "Success";
		return ResponseEntity.ok().body(message);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/thirdurl")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<String> createThirdScheme() {
		System.out.println("Inside Successful Response 2......");
		String message = "Success";
		return ResponseEntity.ok().body(message);
	}

}
