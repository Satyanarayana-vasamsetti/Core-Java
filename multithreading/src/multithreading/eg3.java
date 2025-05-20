package multithreading;

public class eg3 implements Runnable {
	public void run() {
		System.out.println("run() method");
	}
	public static void main(String[] args) {
		eg3 eg3 = new eg3();
		Thread thread = new Thread(eg3);
		thread.start();
	}
}
