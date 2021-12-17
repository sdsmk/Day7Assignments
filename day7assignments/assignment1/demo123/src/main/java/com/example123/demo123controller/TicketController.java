package com.example123.demo123controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example123.demo123model.*;
import com.example123.demo123service.ITicketService;
@RestController
public class TicketController {
	@Autowired
	ITicketService tService;
	
	@GetMapping("/abc")	
	 ResponseEntity met(){
       //return "Hello, can you see thsi message";
		//return new Ticket (1,"orange","monday","friday");
		//return tService.getTickets();
		List<Ticket> lticket=tService.getTickets();
		return new ResponseEntity<>(lticket,HttpStatus.OK);
   }
	@PostMapping("/bookTicket")
   Ticket bookTicket(@RequestBody Ticket ticket){
       //add logic to book the ticket
       return tService.bookTicket(ticket);
       //return ticket;
   }
	@DeleteMapping("/cancelTicket/{id}")
	public int cancelTicket(@PathVariable("id") int id) {
		return tService.cancelTicket(id);
	}
}
