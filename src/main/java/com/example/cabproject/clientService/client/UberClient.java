package com.example.cabproject.clientService.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.cabproject.clientService.ICommuterclient;
import com.example.cabproject.dto.request.IClientRequest;
import com.example.cabproject.dto.request.UberClientRequest;
import com.example.cabproject.enums.ClientEnum;
import com.example.cabproject.utils.SystemConstants;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;

@Service("uberClient")
@Qualifier("uberClient")
public class UberClient implements ICommuterclient {

	@Override
	public UberClient returnClient(String clientType,IClientRequest uberClientRequest) {
		UberClientRequest uberClientRequest1 = (UberClientRequest) uberClientRequest;
		if (clientType.equals(ClientEnum.UBER_GET_ME.getUrlType())) {
			return uberGetMeClient();
		} else if (clientType.equals(ClientEnum.UBER_PATCH_ME.getUrlType())) {
			return uberPatchMeClient();
		} else if (clientType.equals(ClientEnum.UBER_GET_HISTORY.getUrlType())) {
			return uberGetHistoryClient();
		} else if (clientType.equals(ClientEnum.UBER_GET_PAYMENT_METHODS.getUrlType())) {
			return uberGetPaymentMethodsClient();
		} else if (clientType.equals(ClientEnum.UBER_GET_PLACE_PLACEID.getUrlType())) {
			return uberPlaceByPlaceIdClient();
		} else if (clientType.equals(ClientEnum.UBER_GET_PRODUCTS.getUrlType())) {
			return uberGetProductsClient();
		} else if (clientType.equals(ClientEnum.UBER_GET_PRODUCTS_PRODUCTSID.getUrlType())) {
			return uberGetProductsByProductIdClient();
		} else if (clientType.equals(ClientEnum.UBER_GET_ESTIMATES_PRICE.getUrlType())) {
			return uberGetEstimatesPriceClient();
		} else if (clientType.equals(ClientEnum.UBER_GET_ESTIMATES_TIME.getUrlType())) {
			return uberGetEstimatesTimeClient();
		} else if (clientType.equals(ClientEnum.UBER_POST_REQUESTS_ESTIMATE.getUrlType())) {
			return uberPostRequestEstimateClient();
		} else if (clientType.equals(ClientEnum.UBER_POST_REQUESTS.getUrlType())) {
			return uberPostRequestsClient();
		} else if (clientType.equals(ClientEnum.UBER_GET_REQUESTS_CURRENT.getUrlType())) {
			return uberGetRequestsCurrentClient();
		} else if (clientType.equals(ClientEnum.UBER_PATCH_REQUESTS_CURRENT.getUrlType())) {
			return uberPatchRequestsClient();
		} else if (clientType.equals(ClientEnum.UBER_DELETE_REQUESTS_CURRENT.getUrlType())) {
			return uberDeleteRequestsCurrentClient();
		} else if (clientType.equals(ClientEnum.UBER_GET_REQUESTS_REQUESTID.getUrlType())) {
			return uberGetRequestsByRequestIdClient();
		} else if (clientType.equals(ClientEnum.UBER_PATCH_REQUESTS_REQUESTID.getUrlType())) {
			return uberPatchRequestsByRequestIdClient();
		} else if (clientType.equals(ClientEnum.UBER_DELETE_REQUESTS_REQUESTID.getUrlType())) {
			return uberDeleteRequestsByRequestIdClient();
		} else if (clientType.equals(ClientEnum.UBER_GET_REQUESTS_REQUESTID_MAP.getUrlType())) {
			return uberGetRequestByRequestIdMapClient();
		} else if (clientType.equals(ClientEnum.UBER_GET_REQUESTS_REQUESTID_RECIEPT.getUrlType())) {
			return uberGetRequestsByRequestIdRecieptClient();
		}
		return null;
	}

	private UberClient uberGetRequestsByRequestIdRecieptClient() {
		return null;
	}

	private UberClient uberGetRequestByRequestIdMapClient() {
		return null;
	}

	private UberClient uberDeleteRequestsByRequestIdClient() {
		return null;
	}

	private UberClient uberPatchRequestsByRequestIdClient() {
		return null;
	}

	private UberClient uberGetRequestsByRequestIdClient() {
		return null;
	}

	private UberClient uberDeleteRequestsCurrentClient() {
		return null;
	}

	private UberClient uberPatchRequestsClient() {
		return null;
	}

	private UberClient uberGetRequestsCurrentClient() {
		return null;
	}

	private UberClient uberPostRequestsClient() {
		return null;
	}

	private UberClient uberPostRequestEstimateClient() {
		return null;
	}

	private UberClient uberGetEstimatesTimeClient() {
		return null;
	}

	private UberClient uberGetEstimatesPriceClient() {
		return null;
	}

	private UberClient uberGetProductsByProductIdClient() {
		return null;
	}

	private UberClient uberGetProductsClient() {
		return null;
	}

	private UberClient uberPlaceByPlaceIdClient() {
		UberClient uberClient = new UberClient();
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url("https://api.uber.com/v1.2/places/{work}").get()
				.addHeader("Authorization",
						"Bearer JA.VUNmGAAAAAAAEgASAAAABwAIAAwAAAAAAAAAEgAAAAAAAAG8AAAAFAAAAAAADgAQAAQAAAAIAAwAAAAOAAAAkAAAABwAAAAEAAAAEAAAABUrNf0LluC5tSgLhK_8CJlsAAAAoDPy9bWhloZ4ascGB5M22mOVkCqeXzRMVPpgFdV0dMDcwGSezmMq4DbtjNx8XJ8kB4iv3ppZQRHm2ENV--t5NG7HL7ilIMYKXmW9Yb9Io26AtJ_xlKdBOu4nV5_SP25rDtMen8PDmXZ86fzDDAAAAA9uzQZmzAO3Yqk7aSQAAABiMGQ4NTgwMy0zOGEwLTQyYjMtODA2ZS03YTRjZjhlMTk2ZWU")
				.addHeader("Accept-Language", "en_US").addHeader("Content-Type", "application/json").build();
		uberClient.setOkHttpClient(client);
		uberClient.setRequest(request);
		return uberClient;
	}

	private UberClient uberGetPaymentMethodsClient() {
		UberClient uberClient = new UberClient();
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder().url("https://api.uber.com/v1.2/payment-methods").get()
				.addHeader("Authorization",
						"Bearer JA.VUNmGAAAAAAAEgASAAAABwAIAAwAAAAAAAAAEgAAAAAAAAG8AAAAFAAAAAAADgAQAAQAAAAIAAwAAAAOAAAAkAAAABwAAAAEAAAAEAAAABUrNf0LluC5tSgLhK_8CJlsAAAAoDPy9bWhloZ4ascGB5M22mOVkCqeXzRMVPpgFdV0dMDcwGSezmMq4DbtjNx8XJ8kB4iv3ppZQRHm2ENV--t5NG7HL7ilIMYKXmW9Yb9Io26AtJ_xlKdBOu4nV5_SP25rDtMen8PDmXZ86fzDDAAAAA9uzQZmzAO3Yqk7aSQAAABiMGQ4NTgwMy0zOGEwLTQyYjMtODA2ZS03YTRjZjhlMTk2ZWU")
				.addHeader("Accept-Language", "en_US").addHeader("Content-Type", "application/json").build();
		uberClient.setOkHttpClient(client);
		uberClient.setRequest(request);
		return uberClient;
	}

	private UberClient uberGetHistoryClient() {
		UberClient uberClient = new UberClient();
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder().url("https://api.uber.com/v1.2/history?offset=0&limit=15").get()
				.addHeader("Authorization",
						"Bearer JA.VUNmGAAAAAAAEgASAAAABwAIAAwAAAAAAAAAEgAAAAAAAAG8AAAAFAAAAAAADgAQAAQAAAAIAAwAAAAOAAAAkAAAABwAAAAEAAAAEAAAABUrNf0LluC5tSgLhK_8CJlsAAAAoDPy9bWhloZ4ascGB5M22mOVkCqeXzRMVPpgFdV0dMDcwGSezmMq4DbtjNx8XJ8kB4iv3ppZQRHm2ENV--t5NG7HL7ilIMYKXmW9Yb9Io26AtJ_xlKdBOu4nV5_SP25rDtMen8PDmXZ86fzDDAAAAA9uzQZmzAO3Yqk7aSQAAABiMGQ4NTgwMy0zOGEwLTQyYjMtODA2ZS03YTRjZjhlMTk2ZWU")
				.addHeader("Accept-Language", "en_US").addHeader("Content-Type", "application/json").build();
		uberClient.setOkHttpClient(client);
		uberClient.setRequest(request);
		return uberClient;
	}

	private UberClient uberPatchMeClient() {
		return null;
	}

	private UberClient uberGetMeClient() {
		UberClient uberClient = new UberClient();
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url("https://api.uber.com/v1.2/me").get()
				.addHeader("Authorization",
						"Bearer JA.VUNmGAAAAAAAEgASAAAABwAIAAwAAAAAAAAAEgAAAAAAAAG8AAAAFAAAAAAADgAQAAQAAAAIAAwAAAAOAAAAkAAAABwAAAAEAAAAEAAAABUrNf0LluC5tSgLhK_8CJlsAAAAoDPy9bWhloZ4ascGB5M22mOVkCqeXzRMVPpgFdV0dMDcwGSezmMq4DbtjNx8XJ8kB4iv3ppZQRHm2ENV--t5NG7HL7ilIMYKXmW9Yb9Io26AtJ_xlKdBOu4nV5_SP25rDtMen8PDmXZ86fzDDAAAAA9uzQZmzAO3Yqk7aSQAAABiMGQ4NTgwMy0zOGEwLTQyYjMtODA2ZS03YTRjZjhlMTk2ZWU")
				.addHeader("Accept-Language", "en_US").addHeader("Content-Type", "application/json").build();
		uberClient.setOkHttpClient(client);
		uberClient.setRequest(request);
		return uberClient;
	}

	private OkHttpClient okHttpClient;

	private Request request;

	public OkHttpClient getOkHttpClient() {
		return okHttpClient;
	}

	public void setOkHttpClient(OkHttpClient okHttpClient) {
		this.okHttpClient = okHttpClient;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

}
