//multilevel inheritance
class aa{
	void m1() {
		System.out.println("M1 method");
	}
}
class bb extends aa{
	void m2() {
		System.out.println("M2 method");
	}
}
class cc extends bb{
	void m3() {
		System.out.println("M3 method");
	}
}
public class multilevel {
	public static void main(String[] args) {
		cc C = new cc();
		C.m1();
		C.m2();
		C.m3();
	}
}
