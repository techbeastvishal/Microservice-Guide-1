package com.techbeast.kanban.dsh.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DasboardNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2769945608050984424L;

	public DasboardNotFoundException(String exception) {
		super(exception);
	}
}
