package com.camforge.eden.client.entity.login;

import java.util.Date;

import com.camforge.eden.client.entity.login.user.User;

public class Login {

	private User	loggedInUser;
	private boolean	loggedIn;
	private Date	sessionExpiration;

	public User getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(User loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public Date getSessionExpiration() {
		return sessionExpiration;
	}

	public void setSessionExpiration(Date sessionExpiration) {
		this.sessionExpiration = sessionExpiration;
	}
}
