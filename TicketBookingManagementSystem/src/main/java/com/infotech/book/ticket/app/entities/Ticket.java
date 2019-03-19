package com.infotech.book.ticket.app.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_id")
	private Integer ticketId;

	@Column(name = "passenger_name", nullable = false)
	private String passemgerName;
	@Column(name = "booking_date")
	private Date bookingDate;
	@Column(name = "source_station")
	private String sourceStation;
	@Column(name = "dest_station")
	private String dest_Station;
	@Column(name = "email")
	private String email;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getPassemgerName() {
		return passemgerName;
	}
	public void setPassemgerName(String passemgerName) {
		this.passemgerName = passemgerName;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getSourceStation() {
		return sourceStation;
	}
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	public String getDest_Station() {
		return dest_Station;
	}
	public void setDest_Station(String dest_Station) {
		this.dest_Station = dest_Station;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
