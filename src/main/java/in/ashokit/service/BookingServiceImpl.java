package in.ashokit.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.ashokit.binding.request.Passenger;
import in.ashokit.binding.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService {

	//Maintain a MAP for the Tickets
	private Map<Integer, Ticket> ticketsMap = new HashMap<>();
	
	//Put a ticketNumber variable that will be increamented for each req
	private Integer ticketNum = 1;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		//Logic to bookTicket
		
		//Then whatever passenger data copy that in ticket
		Ticket t = new Ticket();	
		BeanUtils.copyProperties(passenger, t);
		
		//set the remainig Ticket specific properties
		t.setCost(550.00);
		t.setStatus("CONFIRMETD");
		t.setTicketNum(ticketNum);
		
		//put the ticket data in the MAP which is acting as DB as of now
		ticketsMap.put(ticketNum, t);
		
		//increament the ticketNum
		ticketNum++;
		
		//return the ticket object
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNum) {
		//First check if the Ticket with the num is present in map or not
		if(ticketsMap.containsKey(ticketNum)) {
			//if present, return the value, based on the key
			return ticketsMap.get(ticketNum);
		}
		
		//If ticket not available with that ticketNum then return null
		return null;
	}
}
