package in.ashokit.binding.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {
	private String name;
	private String fromAddr;
	private String toAddr;
	private String doj;
	private String trainNum;
}
