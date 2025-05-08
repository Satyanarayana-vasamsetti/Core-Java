class o{
	void m1() {
		System.out.println("method 1");
	}
}
class t extends o{
	void m2() {
		System.out.println("method 2");
	}
}
class th extends o{
	void m3() {
		System.out.println("method 3");
	}
}
public class heirarchical {
	public static void main(String[] args) {
		th t = new th();
		t.m1();
		t.m3();
	}

}
