
public class Eg2 {
	//types of methods 
	//even main method is static we can't change main method syntax
	//to call instance method we must create object to it
	//to call static method we use class name
	public static void main(String[] args) {
		Eg2 eg=new Eg2();
		eg.m1();
		Eg2.M1();
	}
	
	//Instance method
	public void m1() {
		System.out.println("Instance Method");
	}
	//Static Method
	public static void M1() {
		System.out.println("Static Method");
	}
	
}
