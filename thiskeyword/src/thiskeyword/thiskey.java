package thiskeyword;

public class thiskey {
	
	int id ;
	String name;
	String email;
	String address;
//	public thiskey(int id, String name, String email, String address) {
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.address = address;
//	}
//	public thiskey(int id, String name, String email, String address) {
//	id = id;
//	name = name;
//	email = email;
//	address = address;
//}
	//error because it is effected 
	public thiskey(int i,String n,String e,String a) {
		id = i;
		name = n;
		email = e;
		address = a;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(address);
	}
	
	public static void main(String[] args) {
		thiskey thiskey = new thiskey(1,"bunny","bunny@gmail","marriveedu");
		thiskey.display();
	}
}
