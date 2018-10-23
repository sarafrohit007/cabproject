package com.example.cabproject.systemproperties;

import java.util.HashMap;
import java.util.Map;

import com.example.cabproject.cacheinterfaces.Cache;

@Cache(name = "systemproperties")
public class SystemPropertiesCache {

	private final Map<String, String> properties                                 = new HashMap<String, String>();
	
	private static final String UBER_GET_ME_URL = "";

	public String getUberGetMeUrl() {
		return properties.get(UBER_GET_ME_URL);
	}
	
	
}