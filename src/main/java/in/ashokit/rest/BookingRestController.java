package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.request.Passenger;
import in.ashokit.binding.response.Ticket;
import in.ashokit.service.BookingService;

@RestController
public class BookingRestController {
	//Perform Dependency injection to inject Service reference
	@Autowired
	private BookingService service;
	
	//Create a POST method to Book the Ticket
	@PostMapping(value = "/ticket", consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger p){
		System.out.println(p);
		
		//call the service class bookTicket method, by passing Passenger data
		Ticket t = service.bookTicket(p);
		
		//Send the Ticket object, with a status code as response
		return new ResponseEntity<>(t, HttpStatus.CREATED);
	}
	
	//Create a GET method, to get the ticket data based on number
	//Pass the TicketNum as path-param to get that specific ticket details
	@GetMapping(value = "/getTicket/{ticketNum}", produces = {"application/json"})
	public Ticket getTicketByNum(@PathVariable Integer ticketNum) {
		//call the service class method
		return service.getTicket(ticketNum);
	}
}	









