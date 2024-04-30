package in.ashokit.binding.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {	
	private Integer ticketNum;
	private String status;
	private Double cost;
	private String name;
	private String fromAddr;
	private String toAddr;
	private String doj;
	private String trainNum;
}
