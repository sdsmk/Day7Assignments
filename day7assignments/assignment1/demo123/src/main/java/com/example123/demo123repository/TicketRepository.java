package com.example123.demo123repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example123.demo123model.Ticket;
@Component
public class TicketRepository{

	public List<Ticket> lticket;
	static {
		
	}
	public TicketRepository() {
		lticket=new ArrayList<>();
	}
	
	public Ticket addTicket(Ticket ticket) {
		lticket.add(ticket);
		
		return ticket;
	}
	
	public List<Ticket> getTickets(){
		return lticket;
	}
	public int deleteTicket(int id){
		lticket.remove(id);
		return id;
	}
}
