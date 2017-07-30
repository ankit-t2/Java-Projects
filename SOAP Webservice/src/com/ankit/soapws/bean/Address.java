package com.ankit.soapws.bean;

import java.io.Serializable;

public class Address  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5099752332527786332L;

	private String firstLine;
	private String city;
	private String postCode;
	
	public String getFirstLine() {
		return firstLine;
	}
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}



}
