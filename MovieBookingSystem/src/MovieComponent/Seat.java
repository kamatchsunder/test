package MovieComponent;

import java.util.HashMap;
import java.util.Map;

public class Seat {

	
	Map<String,Integer> seats;
	
	public Seat(){
		
		seats = new HashMap<String,Integer>();
	}

	public Map<String, Integer> getSeats() {
		return seats;
	}

	public void setSeats(Map<String, Integer> seats) {
		this.seats = seats;
	}
	
	
	
	
}
