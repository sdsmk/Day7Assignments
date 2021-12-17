package com.example91.demo91;

import java.time.LocalDateTime;

public class CustomerAlreadyExistsException extends RuntimeException{
	private LocalDateTime datetime;
	private String path;
	private String type;
	public CustomerAlreadyExistsException(LocalDateTime datetime, String path, String type) {
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
