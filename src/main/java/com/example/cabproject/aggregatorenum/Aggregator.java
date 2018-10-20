package com.example.cabproject.aggregatorenum;

public enum Aggregator {

	OLA("ola"),UBER("uber");
	
	 String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	Aggregator(String name){
		this.name = name;
	}
	 
	 
}
