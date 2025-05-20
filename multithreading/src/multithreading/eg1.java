package multithreading;

public class eg1 {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		System.out.println(thread.getName());//main
		System.out.println(thread.getClass());//class java.lang.Thread
		System.out.println(thread.getState());//RUNNABLE
		System.out.println(thread.getPriority());//5
	}
}
