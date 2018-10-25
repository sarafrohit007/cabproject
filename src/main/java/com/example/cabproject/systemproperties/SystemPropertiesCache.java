package com.example.cabproject.systemproperties;

import java.util.HashMap;
import java.util.Map;

import com.example.cabproject.cacheinterfaces.Cache;

@Cache(name = "systemproperties")
public class SystemPropertiesCache {

	private final Map<String, String> properties = new HashMap<String, String>();

	private static final String UBER_GET_ME_URL = "uber.get.me.url";

	private static final String UBER_CLIENT_SECRET = "uber.client.secret";

	private static final String UBER_CLIENT_ID = "uber.client.id";

	private static final String UBER_PATCH_ME_URL = "uber.patch.me.url";

	public String getUberGetMeUrl() {
		return properties.get(UBER_GET_ME_URL);
	}

	public String getUberClientSecret() {
		return properties.get(UBER_CLIENT_SECRET);
	}

	public String getUberClientId() {
		return properties.get(UBER_CLIENT_ID);
	}

	public static String getUberPatchMeUrl() {
		return UBER_PATCH_ME_URL;
	}

}
