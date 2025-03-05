//Mix local variables with static and instance methods
public class Eg4 {
	public static void main(String[] args) {
		int a = 10; //Local variable
		int b = 20; //Local variable
		System.out.println(a +" and "+b);
		Eg4 eg4  = new Eg4();
		eg4.instanceMethod();
		staticMethod();
	}
	public static void staticMethod() {
		int x = 100; //Local variable
		int y = 200; //Local variable
		System.out.println(x +" and "+y);
	}
	public  void instanceMethod() {
		int i = 1000; //Local variable
		int j = 2000; //Local variable
		System.out.println(i +" and "+j);
	}
}
