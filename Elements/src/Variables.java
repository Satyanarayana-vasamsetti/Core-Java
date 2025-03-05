
public class Variables {
	//The below are the instance variables which are outside of main method and inside the class
	
	int a = 10; //Instance variable
	int b = 30;	//Instance variable
	
	//Static variable also created inside the class and outside of method but with static keyword 
	static int c  = 143; //static variable
	public static void main(String[] args) {
		//Local variables are created inside the method 
		
		int d = 341;  //Local Variable
		double price = 29000;  //Local Variable
		
		Variables inv = new Variables();
		System.out.println(inv.a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(price);
	}
}
