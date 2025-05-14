package thiscons;

public class thisconst {
	public thisconst() {
		this(1);
		System.out.println("default constructor");
//		this(3);
//the above is not possible because this() constructor is
//always define first that means constructor call must be first
	}
	public thisconst(int id) {
		System.out.println("Id :" + id);
	}
	
	public static void main(String[] args) {
		new thisconst();
	}
}
