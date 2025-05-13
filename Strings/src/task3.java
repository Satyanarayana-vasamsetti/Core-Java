//memory of string 
public class task3 {

	public static void main(String[] args) {
		//when we create string literal one object is create
		//in string poll or scp(string constant poll)
		
		String s = "satya";
		System.out.println(s);
		
		//when we create string using new keyword then two
		//objects are created one in heap area 
		//another one in string constant poll
		
		String course = new String("Java");
		System.out.println(course);
	}
}
