package com.camforge.eden.event.login;

import com.camforge.eden.client.entity.login.user.User;
import com.camforge.eden.event.Event;

public interface LoginEvent extends Event {
	public Event login(User user);

	public Event logout(User user);
}
