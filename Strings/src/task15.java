
public class task15 {
	public static void main(String[] args) {
		 String name = "Bunny";
		 System.out.println(name.toUpperCase());
		 System.out.println(name.toLowerCase());
		 
		 //delete
		 String a = new String("Java is best programming language");
		 StringBuffer sb = new StringBuffer(a);
		 System.out.println(sb.deleteCharAt(4));
	}
}
