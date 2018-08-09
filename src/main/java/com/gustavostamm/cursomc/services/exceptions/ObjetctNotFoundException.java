package com.gustavostamm.cursomc.services.exceptions;

public class ObjetctNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ObjetctNotFoundException(String msg) {
		super(msg);
	}

	public ObjetctNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
