//Constructors
public class Constructors {
	public Constructors() {
		System.out.println("Default Constructor");
	}
	public Constructors(int a , int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		new Constructors();
		new Constructors(20,30);
	}
}
