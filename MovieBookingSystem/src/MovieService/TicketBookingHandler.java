package MovieService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Login.User;
import Utilities.MovieHelper;
import Utilities.MovieTicketHelper;
import Utilities.TicketBooker;

public class TicketBookingHandler implements ITicketBookingHandler{

	
	private static final ExecutorService service = Executors.newFixedThreadPool(50);
	
	
	
	public TicketBookingHandler(){

	}
	

	
	@Override
	public void consumeRequest() {
		

		User u = getUserObject();
		
		
		
	}

	private User getUserObject() {
		
		return null;
	}

	@Override
	public void produceResponse() {
		
		
	}

}
