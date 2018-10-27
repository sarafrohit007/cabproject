package com.example.cabproject.enums;

public enum PlacesEnum {

	OFFICE("office"), HOME("home");

	private String placeType;

	public String getPlaceType() {
		return placeType;
	}

	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	PlacesEnum(String placeType) {
		this.placeType = placeType;
	}

}
