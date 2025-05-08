package polymorphism;
//Runtime polymorphism is achived by the method overriding
//it is dynamic binding 
// it has same method with same arguments
class Animal{
	void display() {
		System.out.println("Animals make sounds");
	}
}
class Dog extends Animal{
	void display() {
		System.out.println("Boww Boww");
	}
}
public class runtime {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();
		Animal an = new Dog();
		an.display();
				 
	}
}
