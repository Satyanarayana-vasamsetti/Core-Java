package superkeyvar;
class q {
	public q() {
		System.out.println("default const of parent");
	}
}
class w extends q{
	public w() {
		super();
		System.out.println("default const of child");
	}
	public w(int id) {
		this();
		System.out.println("parameter constructor "+id);
	}
}
public class supercons {
	public static void main(String[] args) {
		new w(10);
	}
}
