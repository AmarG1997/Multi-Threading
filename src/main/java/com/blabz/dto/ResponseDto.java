package com.blabz.dto;

public class ResponseDto {
	
	String message;
	
	public ResponseDto(String msg) {
		this.message=msg;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ResponseDto [message=" + message + "]";
	}
	
	

	
}
