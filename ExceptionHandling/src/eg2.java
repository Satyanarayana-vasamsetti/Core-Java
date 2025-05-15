
public class eg2 {
	public static void main(String[] args) {
		//Runtime error
		try {
			int[] a = {10,11,13};
			int y = 1/0; 	 	
			System.out.println(a[10]);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
