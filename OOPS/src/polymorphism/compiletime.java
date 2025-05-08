package polymorphism;
//compile time polymorphism is achived by method overloading 
//it is also a static/early binding 
//same methods with different arguments
class One{
	void addtwo(int a ,int b) {
		System.out.println(a+b);
	}
	void addtwo(int a ,int b,int c) {
		System.out.println(a+b+c);
	}
}
public class compiletime {
	public static void main(String[] args) {
		One o = new One();
		o.addtwo(0, 0);
		o.addtwo(1,2,3);
	}
}
