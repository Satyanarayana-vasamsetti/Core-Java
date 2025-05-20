package multithreading;

public class eg2 extends Thread{
	public static void main(String[] args) {
		eg2 eg2 = new eg2();
		eg2.start();
	}
	public void run() {
		System.out.println("run() method");
	}
}
