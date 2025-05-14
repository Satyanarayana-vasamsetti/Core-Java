package superkeyvar;
class p {
	void m1() {
		System.out.println("method 1");
	}
}
class k extends p{
	void m2() {
		System.out.println("method 2");
	}
	void m3() {
		super.m1();
		System.out.println("method 3");
		this.m2();
	}
}
public class supermeth {
	public static void main(String[] args) {
		new k().m3();
	}
}
