package com.example.cabproject.enums;

public enum ClientEnum {

	UBER_GET_ME("user.get.me"),
	UBER_PATCH_ME("user.patch.me"),
	UBER_GET_HISTORY("uber.get.history"),
	UBER_GET_PAYMENT_METHODS("uber.get.payment.methods"),
	UBER_GET_PLACE_PLACEID("uber.get.place.placeid"),
	UBER_PUT_PLACE_PLACEID("uber.put.place.placeid"),
	UBER_GET_PRODUCTS("uber.get.products"),
	UBER_GET_PRODUCTS_PRODUCTSID("uber.get.products.productsid"),
	UBER_GET_ESTIMATES_PRICE("uber.get.estimates.price"),
	UBER_GET_ESTIMATES_TIME("uber.get.estimates.time"),
	UBER_POST_REQUESTS_ESTIMATE("uber.post.requests.estimate"),
	UBER_POST_REQUESTS("uber.post.requests"),
	UBER_GET_REQUESTS_CURRENT("uber.get.requests.current"),
	UBER_PATCH_REQUESTS_CURRENT("uber.patch.requests.current"),
	UBER_DELETE_REQUESTS_CURRENT("uber.delete.requests.current"),
	UBER_GET_REQUESTS_REQUESTID("uber.get.requests.requestid"),
	UBER_PATCH_REQUESTS_REQUESTID("uber.patch.requests.requestid"),
	UBER_DELETE_REQUESTS_REQUESTID("uber.delete.requests.requestid"),
	UBER_GET_REQUESTS_REQUESTID_MAP("uber.get.requests.requestid.map"),
	UBER_GET_REQUESTS_REQUESTID_RECIEPT("uber.get.requests.requestid.reciept");
	
	private String urlType;

	public String getUrlType() {
		return urlType;
	}

	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}
	
	ClientEnum(String urlType){
		this.urlType=urlType;
	}
}
