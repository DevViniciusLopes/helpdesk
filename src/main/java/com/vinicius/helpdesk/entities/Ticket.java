package com.vinicius.helpdesk.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private Instant createdAt;
	@Enumerated(EnumType.STRING)
	private TicketStatus status;
	
	@PrePersist
	public void setCreatedAt() {
		 if (createdAt == null) {
			  this.createdAt = Instant.now();
		 }
		 
	}

	public Ticket() {

	}

	public Ticket(String title, String description, TicketStatus status) {
		super();
		
		this.title = title;
		this.description = description;
		this.createdAt = createdAt;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public TicketStatus getStatus() {
		return status;
	}

	public void setStatus(TicketStatus status) {
		this.status = status;
	}

	
}
