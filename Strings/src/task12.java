
public class task12 {
	public static void main(String[] args) {
		//startsWith() and endsWith()
		String name = new String("Bunny");
		System.out.println(name.startsWith("B"));//true
		System.out.println(name.startsWith("b"));//false
		System.out.println(name.startsWith("u"));//false
		
		//endsWith()
		System.out.println(name.endsWith("y"));
		
		//contains()
		System.out.println(name.contains("u"));//true
		System.out.println(name.contains("x"));//false
		
		//charAt()
		System.out.println(name.charAt(0));//B
		System.out.println(name.charAt(7));//StringIndexOutOfBoundsException
		
}
}
