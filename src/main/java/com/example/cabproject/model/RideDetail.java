package com.example.cabproject.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ride_detail", catalog = "ride_detail")
public class RideDetail implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -8038891211353584706L;

	private Integer id;

	private Date bookedAt;

	private UserInfo bookedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBookedAt() {
		return bookedAt;
	}

	public void setBookedAt(Date bookedAt) {
		this.bookedAt = bookedAt;
	}

	public UserInfo getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(UserInfo bookedBy) {
		this.bookedBy = bookedBy;
	}

}
