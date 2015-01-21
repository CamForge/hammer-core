package com.camforge.eden.client.entity.login.user.address;

/** 
 * @author:  developer
 * @Created: Jan 21, 2015 at 7:37:12 AM
 *
 * @Last_Updated_By: $Author$
 * @Last_Updated_On: $Date$
 * @Revision $Rev$
 * @Project: goldenhammer-client
 * @Location: $URL$
 *
 **/

public class Address {
	private String	address1;
	private String	address2;
	private boolean	outsideContinentalUS;
	private String	city;
	private String	state;
	private String	zipCode;
	private String	country;

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

	public boolean isOutsideContinentalUS() {
		return outsideContinentalUS;
	}

	public void setOutsideContinentalUS(boolean outsideContinentalUS) {
		this.outsideContinentalUS = outsideContinentalUS;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
