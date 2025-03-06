//Blocks
//Two types 1.Static and 2.Instance
public class Blocks {
	public static void main(String[] args) {
		new Blocks();
		
	}
	
	//to create a static block use static keyword
	static {
		System.out.println("Static Block");
	}
	//to create a instance block there is no any keyword to use
	//to execute instance block we need to create an object
	{
		System.out.println("Instance Block");
	}
}
