package com.techbeast.kanban.emp.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3861534418928543825L;

	public EmployeeNotFoundException(String exception) {
		super(exception);
	}
}
