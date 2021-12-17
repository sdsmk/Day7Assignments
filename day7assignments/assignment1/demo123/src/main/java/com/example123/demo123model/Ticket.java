package com.example123.demo123model;


public class Ticket {
	
	
	private int id;
	private String travels_name;
	private String from, to;
	public Ticket(int id, String travels_name, String from, String to) {
		super();
		this.id = id;
		this.travels_name = travels_name;
		this.from = from;
		this.to = to;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTravels() {
		return travels_name;
	}
	public void setTravels(String travels) {
		this.travels_name = travels;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
}
