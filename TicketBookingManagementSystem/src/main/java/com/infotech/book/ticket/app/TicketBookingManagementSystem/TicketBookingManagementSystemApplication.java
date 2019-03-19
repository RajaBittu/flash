package com.infotech.book.ticket.app.TicketBookingManagementSystem;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(TicketBookingManagementSystemApplication.class, args);
		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService",
				TicketBookingService.class);
		Ticket ticket=new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDest_Station("Hyd");
		ticket.setEmail("kr.gmail");
		ticket.setPassemgerName("Raja");
		ticket.setSourceStation("Bang");

	}

}
