
public class task13 {
	public static void main(String[] args) {
		//replace()
		String a = new String("Java Programming");
		System.out.println(a.replace("J", "j"));//java Programming
		System.out.println(a);//orginal value is not changed 
		
		//replaceFirst()
		String b = new String("Java Programming Java Program");
		System.out.println(b.replace("Pro","pro"));//Java programming Java program
		System.out.println(b.replaceFirst("Pro", "pro"));//Java programming Java Program
		
		//replaceAll()
		System.out.println(b.replaceAll("o", "O"));
	}
	
}
