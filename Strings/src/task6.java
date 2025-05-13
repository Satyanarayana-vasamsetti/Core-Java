
public class task6 {
	public static void main(String[] args) {
		byte b[] = {65,66,67};
		String  s= new String(b);//String constructor
		System.out.println(s);//ABC
		
		char ch[] = {'A','B','C'};
		System.out.println(ch);//ABC
		
		String v = new String(ch);
		System.out.println(v);//ABC
	}
}
