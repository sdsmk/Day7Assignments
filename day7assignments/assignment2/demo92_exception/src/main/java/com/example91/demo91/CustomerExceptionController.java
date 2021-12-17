package com.example91.demo91;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.annotation.JsonFormat;

/*
Date and time
Path
Temporary/Permanent
 */

class CustomerExceptionFields {
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime datetime;
	private String path;
	private String type;
	public CustomerExceptionFields(LocalDateTime datetime, String path, String type) {
		super();
		this.datetime = datetime;
		this.path = path;
		this.type = type;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}

@ControllerAdvice
public class CustomerExceptionController {
	@ExceptionHandler(value = CustomerIdInvalidException.class)
	public ResponseEntity<Object> exception(CustomerIdInvalidException ex) {
		
		CustomerExceptionFields more_details = new CustomerExceptionFields(ex.getDatetime(),
				ex.getPath(), ex.getType());
		return new ResponseEntity<>(more_details, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = CustomerAlreadyExistsException.class)
	public ResponseEntity<Object> exception(CustomerAlreadyExistsException ex) {
		
		CustomerExceptionFields more_details = new CustomerExceptionFields(ex.getDatetime(),
				ex.getPath(), ex.getType());
		return new ResponseEntity<>(more_details, HttpStatus.NOT_FOUND);
	}
}
