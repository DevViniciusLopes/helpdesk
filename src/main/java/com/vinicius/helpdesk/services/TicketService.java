package com.vinicius.helpdesk.services;

import org.springframework.stereotype.Service;

import java.util.List;
import com.vinicius.helpdesk.entities.Ticket;
import com.vinicius.helpdesk.repositories.TicketRepository;

@Service
public class TicketService {

	
	private final TicketRepository repository;

	public TicketService(TicketRepository repository) {
		this.repository = repository;
	}
	
	 
	 public List<Ticket> getRegister() {
		 return repository.findAll();
		 
	 }
	
	
}
