package com.camforge.eden.event.handlers;

import com.camforge.eden.event.Event;

public interface DefaultHandler {
	public Event handleEvent(Event event) throws Exception;
}
