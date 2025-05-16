public class eg5 {
	public static void main(String[] args) {
		try {
			String s = "ten";
			int i = Integer.parseInt(s);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
