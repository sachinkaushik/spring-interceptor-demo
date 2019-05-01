package com.demo.interceptor.springinterceptordemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<String> handleInvalidHeader(InvalidHeaderException e){
		return new ResponseEntity<>(e.getMsg(), HttpStatus.PRECONDITION_FAILED);
	}
}
