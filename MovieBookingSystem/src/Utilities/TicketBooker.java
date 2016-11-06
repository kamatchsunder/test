package Utilities;

import Login.User;

public class TicketBooker implements Runnable{

	User user;
	MovieTicketHelper helper;
	
	
	public TicketBooker(User user,MovieTicketHelper helper){
		this.user = user;
		this.helper = helper;
	}
	
	
	@Override
	public void run() {
		
		helper.bookTickets();
		
		
	}

}
