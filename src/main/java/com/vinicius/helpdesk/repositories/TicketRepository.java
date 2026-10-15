package com.vinicius.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.helpdesk.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
