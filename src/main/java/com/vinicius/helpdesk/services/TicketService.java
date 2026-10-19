package com.vinicius.helpdesk.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.vinicius.helpdesk.entities.Ticket;
import com.vinicius.helpdesk.repositories.TicketRepository;

@Service
public class TicketService {

	private final TicketRepository repository;
	TicketService service;

	public TicketService(TicketRepository repository) {
		this.repository = repository;
	}
	
	 
	 public List<Ticket> getRegister() {
		 return repository.findAll();
		 
	 }
	 
	 public Ticket addTicket(Ticket ticket) {
		 return repository.save(ticket);
	 }
	
	 @GetMapping
	 public List<Ticket> getAll(){
		 return service.getRegister();
	 }
	
}
