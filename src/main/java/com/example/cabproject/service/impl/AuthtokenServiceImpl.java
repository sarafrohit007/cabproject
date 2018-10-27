package com.example.cabproject.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.cabproject.dto.request.UberAuthRequest;
import com.example.cabproject.dto.response.UberAuthResponse;
import com.example.cabproject.service.IAuthTokenService;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.sun.media.jfxmedia.Media;

@Service
public class AuthtokenServiceImpl implements IAuthTokenService{

	@Override
	public String getAuthToken() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://login.uber.com/oauth/v2/authorize").queryParam("client_id", "v5YmMO09lbssdRAnOBzB8h0b5G0uUWqd").queryParam("response_type", "code").queryParam("redirect_uri","https://d819b0b2.ngrok.io:443/api/fourthUrl");
		String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println("Printing response "+response);
		return response;
	}

	@Override
	public UberAuthResponse getAuthToken1(String code) {
		System.out.println("Inside getAuthtoken1 function.....");
		//Client client = ClientBuilder.newClient();
		/*WebTarget target = client.target("https://login.uber.com/oauth/v2/token");
		Form form = new Form();
		form.param("client_secret", "65jmSOrfDS5WZvt7vLQ5L9KwKFE31rlg_LjfqOJi");
		form.param("client_id", "v5YmMO09lbssdRAnOBzB8h0b5G0uUWqd");
		form.param("grant_type", "authorization_code");
		form.param("code",code);
		form.param("redirect_uri", "https://dc9b9cf5.ngrok.io:443/api/fourthUrl");*/
		/*MultivaluedMap<String,String> multiValuedMap = new MultivaluedHashMap<String,String>();
		List<String> list1 = new ArrayList<String>();
		list1.add("65jmSOrfDS5WZvt7vLQ5L9KwKFE31rlg_LjfqOJi");
		List<String> list2 = new ArrayList<String>();
		list2.add("v5YmMO09lbssdRAnOBzB8h0b5G0uUWqd");
		List<String> list3 = new ArrayList<String>();
		list3.add("authorization_code");
		List<String> list4 = new ArrayList<String>();
		list4.add(code);
		List<String> list5 = new ArrayList<String>();
		list5.add("https://774daf14.ngrok.io:443/api/fifthUrl");
		multiValuedMap.put("client_secret", list1);
		multiValuedMap.put("client_id", list2);
		multiValuedMap.put("grant_type", list3);
		multiValuedMap.put("code", list4);
		multiValuedMap.put("redirect_uri", list5);
		WebTarget target = client.target("https://login.uber.com/oauth/v2/token");
		UberAuthRequest uberAuthRequest = new UberAuthRequest();
		uberAuthRequest.setClient_id("v5YmMO09lbssdRAnOBzB8h0b5G0uUWqd");
		uberAuthRequest.setClient_secret("65jmSOrfDS5WZvt7vLQ5L9KwKFE31rlg_LjfqOJi");
		uberAuthRequest.setCode(code);
		uberAuthRequest.setGrant_type("authorization_code");
		uberAuthRequest.setRedirect_uri("https://774daf14.ngrok.io:443/api/fifthUrl");
		uberAuthRequest.setScope("profile");*/
		//UberAuthResponse response = target.request().accept(MediaType.APPLICATION_JSON).post(Entity.form(multiValuedMap),UberAuthResponse.class);
		//UberAuthResponse response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(UberAuthResponse.class);
		//UberAuthResponse response = target.request().accept(MediaType.APPLICATION_JSON).post(Entity.form(form),UberAuthResponse.class);
		//System.out.println(response.toString());
		//Response responseUber = target.request().accept(MediaType.APPLICATION_JSON).post(Entity.json(input));		
		//System.out.println("Printing uberResponse.... "+responseUber);
		//System.out.println("Printing uberResponse.... String"+responseUber.toString());
		OkHttpClient client = new OkHttpClient();
		com.squareup.okhttp.MediaType mediatype = com.squareup.okhttp.MediaType.parse("application/x-www-form-urlencoded");
		RequestBody body = RequestBody.create(mediatype, "client_secret=65jmSOrfDS5WZvt7vLQ5L9KwKFE31rlg_LjfqOJi&client_id=v5YmMO09lbssdRAnOBzB8h0b5G0uUWqd&redirect_uri=https://8c4a3ce6.ngrok.io:443/api/fourthUrl&grant_type=authorization_code&code="+code);
		Request request = new Request.Builder().url("https://login.uber.com/oauth/v2/token")
				  .post(body)
				  .addHeader("Content-Type", "application/x-www-form-urlencoded")
				  .addHeader("Cache-Control", "no-cache")
				  .build();
		try {
			com.squareup.okhttp.Response response = client.newCall(request).execute();
			System.out.println("Printing response:-- "+response.body().toString());
			String responseString = response.body().string();
			System.out.println("Printing responseString... "+responseString);
			JSONObject json = new JSONObject(responseString);
			String accessToken = (String) json.get("access_token");
			String token_type = (String) json.get("token_type");
			System.out.println("Printing access_Token,token_type"+ accessToken+"  "+token_type);
			System.out.println("Response.... "+ response.message());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		RequestBody body = RequestBody.create(mediaType, "client_secret=65jmSOrfDS5WZvt7vLQ5L9KwKFE31rlg_LjfqOJi&client_id=v5YmMO09lbssdRAnOBzB8h0b5G0uUWqd&refresh_token=MA.CAESEEkqBj_IgEhKvmsFgvA7GQwiATEoATIBMQ._369SS-StZrzcypZBPY49RopKHocEReFTk3-Ur0q7c4.IG9GFipaC0-xGl7Bsl9S5ybSHUgsOk3Y0i5WwgIUJNk&grant_type=refresh_token");
		Request request = new Request.Builder()
		  .url("https://login.uber.com/oauth/v2/token")
		  .post(body)
		  .addHeader("Content-Type", "application/x-www-form-urlencoded")
		  .addHeader("Cache-Control", "no-cache")
		  .addHeader("Postman-Token", "9e35d5ac-ae41-4a62-88af-243b423004c7")
		  .build();

		Response response = client.newCall(request).execute();*/
		return new UberAuthResponse();
	}

}
