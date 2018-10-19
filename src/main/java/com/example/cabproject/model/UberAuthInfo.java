package com.example.cabproject.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "uber_auth_info", catalog = "poolmaster")
public class UberAuthInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1456719506460892910L;

	private String authToken;

	private String bearerToken;

	private String refreshToken;

	private Date issueDate;
	
	private String expiresin;

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getBearerToken() {
		return bearerToken;
	}

	public void setBearerToken(String bearerToken) {
		this.bearerToken = bearerToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getExpiresin() {
		return expiresin;
	}

	public void setExpiresin(String expiresin) {
		this.expiresin = expiresin;
	}

}
