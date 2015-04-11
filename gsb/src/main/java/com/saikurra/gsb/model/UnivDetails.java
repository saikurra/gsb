package com.saikurra.gsb.model;

import java.io.Serializable;

public class UnivDetails implements Serializable {


	private static final long serialVersionUID = 392106174032808425L;

	private String univName;
	
	private String univCode;
	
	private String univUrl;
	
	private String city;
	
	private String state;
	
	private String zipCode;

	public String getUnivName() {
		return univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
	}

	public String getUnivCode() {
		return univCode;
	}

	public void setUnivCode(String univCode) {
		this.univCode = univCode;
	}

	public String getUnivUrl() {
		return univUrl;
	}

	public void setUnivUrl(String univUrl) {
		this.univUrl = univUrl;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
