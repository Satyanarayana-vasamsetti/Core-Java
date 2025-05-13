//equals() vs ==
public class task4 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1 == s2); //true
		
		String s11 = new String("hello");
		String s22 = new String("hello");
		System.out.println(s11.equals(s22));//true
		System.out.println(s11 == s22);//false
	}
}
//finally what is the conclusion is == checks reference  
