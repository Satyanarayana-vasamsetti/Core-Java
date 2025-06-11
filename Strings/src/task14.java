
public class task14 {
	public static void main(String[] args) {
		String name = "Veera Venkata Satyanarayana";
		//indexOf()
		//char
		System.out.println(name.indexOf("v"));//return -1 
		System.out.println(name.indexOf("a"));//4
		System.out.println(name.indexOf(" "));//5
		
		//char with specific index
		System.out.println(name.indexOf('e', 5));//7
		
		//string
		System.out.println(name.indexOf("r"));//3
		System.out.println(name.indexOf("Satya"));
		
		//string with specific index
		System.out.println(name.indexOf("Venkata", 5));
		
		//lastIndexOf()
		System.out.println(name.lastIndexOf("V"));
		System.out.println(name.lastIndexOf('a'));
		
		//substring()
		System.out.println(name.substring(0,5));
		System.out.println(name.substring(6));
	}
}
