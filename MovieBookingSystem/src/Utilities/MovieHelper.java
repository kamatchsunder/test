package Utilities;

public abstract class MovieHelper implements MovieTicketHelper{


	public MovieHelper(){
		
	}
	
	@Override
	public void bookTickets(){
		
		isTicketsAvailable();
		 bookTicket();
		 payTickets();
		
	}
	
	@Override
	public String cancelTicket(){
		
		return "tickets are cancelled";
	}
	
	
	public abstract boolean isTicketsAvailable();
	
	
	public abstract String bookTicket();
	
	
	
	public abstract void payTickets();
	
	
}
