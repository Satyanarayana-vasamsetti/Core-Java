package interfaces;

interface g {
	void f1();
	void f2();
	void f3();
	void f4();
}
abstract class h implements g{
	public void f1() {
		System.out.println("method one");
	}
}
class j implements g{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("method two");
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		System.out.println("method three");
	}

	@Override
	public void f4() {
		// TODO Auto-generated method stub
		System.out.println("method four");
	}
	
}
public class eg4 {
	public static void main(String[] args) {
		j j = new j();
		j.f2();
		j.f3();
		j.f4();
	}
}
