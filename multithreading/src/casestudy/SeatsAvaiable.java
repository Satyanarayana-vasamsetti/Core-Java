package casestudy;

public class SeatsAvaiable {
	int seats = 5;
	
	public synchronized void bookMovieTickets(String username,int totalseats) throws InterruptedException {
		if(seats>=totalseats && totalseats>0) {
			System.out.println("Hello "+username+" Your have booked "+totalseats+" tickets");
			seats-=totalseats;
			Thread.sleep(3000);
		}else {
			System.out.println("Hello "+username+" Seats are not avaiable");
		}
	}
}
