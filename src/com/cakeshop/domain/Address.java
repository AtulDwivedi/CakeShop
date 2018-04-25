package com.cakeshop.domain;

public class Address {
	
	private String id;
	private String flatNo;
	private String area;
	private String landMark;
	private long pinCode;
	private String city;
	private String state;
	private String country;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Address(String id, String flatNo, String area, String landMark, long pinCode, String city, String state,
			String country) {
		super();
		this.id = id;
		this.flatNo = flatNo;
		this.area = area;
		this.landMark = landMark;
		this.pinCode = pinCode;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", flatNo=" + flatNo + ", area=" + area + ", landMark=" + landMark + ", pinCode="
				+ pinCode + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}