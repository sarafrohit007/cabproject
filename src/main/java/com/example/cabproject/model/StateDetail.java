package com.example.cabproject.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class StateDetail implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 8947271325083645122L;

	private Integer id;

	private String name;

	private boolean isServed;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isServed() {
		return isServed;
	}

	public void setServed(boolean isServed) {
		this.isServed = isServed;
	}

}
