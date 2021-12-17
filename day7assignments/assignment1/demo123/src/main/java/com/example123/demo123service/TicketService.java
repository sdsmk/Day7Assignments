package com.example123.demo123service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example123.demo123model.Ticket;
import com.example123.demo123repository.TicketRepository;

@Component
public class TicketService implements ITicketService {
	
	@Autowired
	TicketRepository tRepository;

	@Override
	public Ticket bookTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		Ticket tt=tRepository.addTicket(ticket);
		return tt;
	}

	@Override
	public List<Ticket> getTickets() {
		// TODO Auto-generated method stub
		List<Ticket> all=tRepository.getTickets();
		return all;
	}

	@Override
	public int cancelTicket(int id) {
		// TODO Auto-generated method stub
		int a=tRepository.deleteTicket(id);
		return a;
	}
}
