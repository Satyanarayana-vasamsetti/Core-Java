//Understanding the return type of all different methods
public class Eg5 {
	//For main method return type is void
	public static void main(String[] args) {
		Eg5 eg5 = new Eg5();
		
		System.out.println(eg5.addTwoNumbers());
	}
	public int addTwoNumbers() {
		int a = 10,b = 20;
		
		return a+b;
	}
}
