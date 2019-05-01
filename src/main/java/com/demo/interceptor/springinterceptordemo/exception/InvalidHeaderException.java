package com.demo.interceptor.springinterceptordemo.exception;

public class InvalidHeaderException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	public InvalidHeaderException(String msg) {
		this.setMsg(msg);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	 

}
