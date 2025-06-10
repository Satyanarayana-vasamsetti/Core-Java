//compareTo()
//compareToIgnoreCase() is same as compareTo() but not case sensitive
public class task10 {
	public static void main(String[] args) {
		String a = new String("A");
		String b = new String("Z");
		System.out.println(a.compareTo(a)); //same value return 0
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
	}
}
