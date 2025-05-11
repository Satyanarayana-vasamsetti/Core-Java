package interfaces;
class a {
	void meth() {
		System.out.println("sample");
	}
}
interface p{
	void m2();
}
class u extends a implements p{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("mehtod 2");
	}
	
}
public class extclass {
	public static void main(String[] args) {
		u u =new u();
		u.meth();
		u.m2();
	}
}
