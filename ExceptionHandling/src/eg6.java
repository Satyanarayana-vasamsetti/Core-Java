
public class eg6 {
	public static void main(String[] args) {
		try {
			
			int[] a = {10,11,13};
				
			System.out.println(a[10]);//
			
			String s = null;
			System.out.println(s.length());
			
			String s1 = "Java is a programming language";
			System.out.println(s1.length());
			System.out.println(s1.charAt(31));
			
			String s11 = "ten";
			int i = Integer.parseInt(s11);
			System.out.println(i);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}catch (NullPointerException e) {
			System.out.println(e);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
