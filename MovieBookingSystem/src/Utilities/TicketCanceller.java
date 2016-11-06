package Utilities;

import Login.User;

public class TicketCanceller implements Runnable{

	User user;
	MovieTicketHelper helper;
	
	
	public TicketCanceller(User user,MovieTicketHelper helper){
		this.user = user;
		this.helper = helper;
	}
	
	
	
	
	@Override
	public void run() {
		
		helper.cancelTicket();
		
	}

}
