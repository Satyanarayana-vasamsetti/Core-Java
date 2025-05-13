class p {
	String v = "Apple";

	public p(String v) {
		this.v = v;
	}
	
	
}
public class task5 {
	public static void main(String[] args) {
		String s = new String("Apple");
		String b = "Samsung";
		b = "Apple";
		System.out.println(s.equals(b)); // true
		
		p P = new p("Apple");
		System.out.println(P.equals(b));//false
		
		System.out.println(s.hashCode());//63476538
		System.out.println(b.hashCode());//63476538 
		//same hashcodes because of string type
		
		System.out.println(P.hashCode());//1159190947
		p k =new p("Samsung");
		System.out.println(k.hashCode());//925858445
		
		//different hashcodes because of object type
	}
}
