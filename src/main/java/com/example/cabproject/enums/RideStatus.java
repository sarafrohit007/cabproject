package com.example.cabproject.enums;

public enum RideStatus {
	
	INITIATED("initiated"),REJECTED("rejected"),COMPLETED("completed"),IN_PROCESS("inprocess");
	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	RideStatus() {
		// TODO Auto-generated constructor stub
	}
	
	RideStatus(String status){
		this.status = status;
	}
	
}
