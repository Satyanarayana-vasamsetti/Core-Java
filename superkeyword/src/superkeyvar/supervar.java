package superkeyvar;
class a {
	int a = 10;
	int b = 20;
}
class b extends a {
	int a = 100;
	int b = 200;
	public b(int a, int b) {
		System.out.println("Local variable :"+a);
		System.out.println("Local variable :"+b);
		System.out.println("instance variable :"+this.a);
		System.out.println("Instance variable :"+this.b);
		System.out.println("parent instance variable :"+super.a);
		System.out.println("parent instance variable :"+super.b);
	}
	
	
}
public class supervar {
	
	public static void main(String[] args) {
		new b(1000,2000);
	}
}
