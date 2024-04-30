package in.ashokit.service;

import in.ashokit.binding.request.Passenger;
import in.ashokit.binding.response.Ticket;

public interface BookingService {
	//Method to Book Ticket based on Passenger Data
	Ticket bookTicket(Passenger passenger);
	
	//Method to GET the Ticket details based on passed TicketNum
	Ticket getTicket(Integer ticketNum);
}
