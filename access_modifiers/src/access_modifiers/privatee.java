package access_modifiers;
class a{
	private int i = 20;
	
	private void display() {
		System.out.println("display");
		System.out.println(i);
	}
}
public class privatee {
	public static void main(String[] args) {
		a i = new a();
		//we can't access outof class private 
	}
}
