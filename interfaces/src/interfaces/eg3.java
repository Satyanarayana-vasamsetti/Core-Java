package interfaces;
//if a class implements more than one interface than
//we have to separate with comma

interface q {
	void m1();
}
interface w{
	void m2();
}
class e implements q,w{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1");
	}

	@Override
	public void m2() {
		System.out.println("Method 2");
		
	}
	
}
public class eg3 {
	public static void main(String[] args) {
		e e = new e();
		e.m1();
		e.m2();
	}
}
