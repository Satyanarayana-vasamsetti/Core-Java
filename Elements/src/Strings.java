//Strings is nothing but a sequence of characters 
//There are two ways to initialize
//1.String literal
//2.Using new Keyword
public class Strings {
	public static void main(String[] args) {
		String name = "Bunny";
		System.out.println(name);
		
		String username =  new String("Bunny");
		System.out.println(username);
		
		//Equal method returns true or false
		//If matches it returns true
		//Not matched it returns false
		System.out.println(name.equals(username));
	}
}
