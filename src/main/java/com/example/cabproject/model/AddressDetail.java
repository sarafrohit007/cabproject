package com.example.cabproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "address_detail", catalog = "cabapp")
public class AddressDetail implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 3916654933686274567L;

	private Integer id;

	private CountryDetail countryDetail;

	private StateDetail stateDetail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CountryDetail getCountryDetail() {
		return countryDetail;
	}

	public void setCountryDetail(CountryDetail countryDetail) {
		this.countryDetail = countryDetail;
	}

	public StateDetail getStateDetail() {
		return stateDetail;
	}

	public void setStateDetail(StateDetail stateDetail) {
		this.stateDetail = stateDetail;
	}

}
