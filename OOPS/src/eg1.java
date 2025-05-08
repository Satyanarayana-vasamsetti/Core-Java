//single level inheritance 
class a{
	void m1()
	{
		System.out.println("M1 method");
	}
}
class b extends a{
	void m2()
	{
		System.out.println("M2 method");
	}
}
public class eg1 {
	public static void main(String[] args) {
		b B =  new b();
		B.m2();
		B.m1();
	}
}
