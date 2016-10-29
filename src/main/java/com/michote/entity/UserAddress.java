package com.michote.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by jtq603 on 10/16/16.
 */

@Entity
public class UserAddress {

    // An autogenerated id (unique for each user in the db)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userAddressId;

	private String city;

	private String State;

	private String country;

	private String zip;

	private String address1;

	private String address2;

	@ManyToOne
	private User user;

	public UserAddress() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getUserAddressId() {
		return userAddressId;
	}

	public void setUserAddressId(long userAddressId) {
		this.userAddressId = userAddressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}
}
