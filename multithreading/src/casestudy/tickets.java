package casestudy;

public class tickets extends Thread {
	SeatsAvaiable seatavaiable;
	String user;
	int noOfseats;
	public tickets(SeatsAvaiable seatavaiable, String user, int noOfseats) {
		super();
		this.seatavaiable = seatavaiable;
		this.user = user;
		this.noOfseats = noOfseats;
	}
	
	@Override
	public void run() {
		try {
			seatavaiable.bookMovieTickets(user, noOfseats);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
