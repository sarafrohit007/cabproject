package com.example.cabproject.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_info", catalog = "cabapp")
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8649987590481417393L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Integer id;

	private Date createdAt;

	private Date updated;

	private boolean isActive;

	private UberAuthInfo uberAuth;

	private OlaAuthInfo olaAuth;

	private boolean registerdAsDriver;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@NotNull
	@Column(name = "created", nullable = false)
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@NotNull
	@Column(name = "updated", nullable = false)
	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@NotNull
	@Column(name = "isactive", nullable = false)
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name = "uberauth", nullable = false)
	public UberAuthInfo getUberAuth() {
		return uberAuth;
	}

	public void setUberAuth(UberAuthInfo uberAuth) {
		this.uberAuth = uberAuth;
	}

	@Column(name = "olaauth", nullable = false)
	public OlaAuthInfo getOlaAuth() {
		return olaAuth;
	}

	public void setOlaAuth(OlaAuthInfo olaAuth) {
		this.olaAuth = olaAuth;
	}

	public boolean isRegisterdAsDriver() {
		return registerdAsDriver;
	}

	public void setRegisterdAsDriver(boolean registerdAsDriver) {
		this.registerdAsDriver = registerdAsDriver;
	}

}
