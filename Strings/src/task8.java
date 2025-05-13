
public class task8 {
	public static void main(String[] args) {
		String s = "hello bro how are you";
		String sp[] = s.split(" ");
		for (String string : sp) {
			System.out.println(string);
		}
		
		String s1 = String.join(" ", sp);
		System.out.println(s1);
	}
}
