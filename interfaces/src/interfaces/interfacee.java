package interfaces;
//here in interfaces we only define abstract methods
//or else it make abstract and public by default
interface m{
	void m1();
	public void m2();
	public abstract void m3();
}

class b implements m{

	@Override
	public void m1() {
		System.out.println("method one");
		
	}

	@Override
	public void m2() {
		System.out.println("method 2");
		
	}

	@Override
	public void m3() {
		System.out.println("method 3");
		
	}
	
}
public class interfacee {
	public static void main(String[] args) {
		b n = new b();
		n.m1();
		n.m2();
		n.m3();
	}
}
