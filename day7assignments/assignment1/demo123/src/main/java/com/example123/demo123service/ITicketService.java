package com.example123.demo123service;

import java.util.List;

import com.example123.demo123model.Ticket;

public interface ITicketService {
	public Ticket bookTicket(Ticket ticket);
	
	public List<Ticket> getTickets();
	public int cancelTicket(int id);

}
