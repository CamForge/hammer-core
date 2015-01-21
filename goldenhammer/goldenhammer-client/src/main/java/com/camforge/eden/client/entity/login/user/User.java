package com.camforge.eden.client.entity.login.user;

import com.camforge.eden.client.entity.login.user.address.Address;

/** 
 * @author:  developer
 * @Created: Jan 21, 2015 at 7:31:26 AM
 *
 * @Last_Updated_By: $Author$
 * @Last_Updated_On: $Date$
 * @Revision $Rev$
 * @Project: goldenhammer-client
 * @Location: $URL$
 *
 **/

public class User {
	private String	userName;
	private String	password;
	private String	roles;
	private String	email;
	private Address	home;
	private Address	shipping;
	private Address	secondary;
	private String	phoneNumber;
	private Gender	gender;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getHome() {
		return home;
	}

	public void setHome(Address home) {
		this.home = home;
	}

	public Address getShipping() {
		return shipping;
	}

	public void setShipping(Address shipping) {
		this.shipping = shipping;
	}

	public Address getSecondary() {
		return secondary;
	}

	public void setSecondary(Address secondary) {
		this.secondary = secondary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
