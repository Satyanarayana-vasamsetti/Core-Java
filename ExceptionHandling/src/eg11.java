
public class eg11 {
	public static void main(String[] args) {
		System.out.println(check(10,10));
	}
	public static int check(int a,int b) {
		try {
			return a/b;
		} catch (Exception e) {
			return -1;
		}
	}
}
