package casestudy;

public class client {
	public static void main(String[] args) {
		SeatsAvaiable avaiable = new SeatsAvaiable();
		tickets t1 = new tickets(avaiable,"bunny", 3);
		tickets t2 = new tickets(avaiable, "sai", 5);
		t1.start();
		t2.start();
		
	}
}

