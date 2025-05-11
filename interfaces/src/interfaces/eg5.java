package interfaces;

interface o {
	void m1();
	void m2();
}
interface n{
	void m3();
	void m4();
}
interface f extends o,n{
	
}
//multiple inheritance is support through interface
class l implements f{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("method one");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("method two");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("method three");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("method four");
	}
	
}
public class eg5 {
	public static void main(String[] args) {
		l l = new l();
		l.m1();
		l.m2();
		l.m3();
		l.m4();
	}
}
