
public class Eg2 {
	//types of methods 
	//even main method is static we can't change main method syntax
	//to call instance method we must create object to it
	
	public static void main(String[] args) {
		Eg2 eg=new Eg2();
		eg.m1();
	}
	
	public void m1() {
		System.out.println("M1 method running ");
	}
}
