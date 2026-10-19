package com.vinicius.helpdesk.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.vinicius.helpdesk.entities.Ticket;
import com.vinicius.helpdesk.services.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	private final TicketService service;

	public TicketController(TicketService service) {
		this.service = service;
	}
	
	@PostMapping
	public Ticket postAdd(@RequestBody Ticket ticket) {
		return service.addTicket(ticket);
	}
	
	@GetMapping
	public List<Ticket> getAll() {
	    return service.getRegister();
	}
	
	
	
}
