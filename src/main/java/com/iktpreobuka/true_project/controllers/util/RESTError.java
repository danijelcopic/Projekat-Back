package com.iktpreobuka.true_project.controllers.util;

//import com.fasterxml.jackson.annotation.JsonView;

public class RESTError {
	
	//@JsonView(Views.Public.class)
	private Integer code;
	//@JsonView(Views.Public.class)
	private String message;
	
	public RESTError() {}
	
	
	public RESTError(Integer code, String message) {
		this.code=code;
		this.message = message;
	}
	public Integer getCode() {
		return code;
	}
    public String getMessage() {
    	return message;
    }
    
}
