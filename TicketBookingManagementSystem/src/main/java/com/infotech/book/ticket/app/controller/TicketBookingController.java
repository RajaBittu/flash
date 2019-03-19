package com.infotech.book.ticket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {
	@Autowired
	private TicketBookingService ticketBookingService;

	@PostMapping(value = "/create")
	public Ticket createBooking(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}

	@GetMapping(value = "/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}

}
