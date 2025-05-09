package abstraction;
abstract class a{
	public void m1() {
		System.out.println("Concrete method or Non abstract method");
		
	}
	public abstract void m2();
	//abstract method didn't implement directly
}

class b extends a{

	@Override
	public void m2() {
		System.out.println("Abstract method");
		
	}
	
}
public class abs {
	public static void main(String[] args) {
		b c =new b();
		c.m1();
		c.m2();
	}
}
