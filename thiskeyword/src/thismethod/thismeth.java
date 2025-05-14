package thismethod;

public class thismeth {
	void add() {
		this.update();//this how this method is working
		update();//same as above automatically done
		System.out.println("add method");
		put();
	}
	void put() {
		System.out.println("put method");
	}
	void update() {
		System.out.println("update method");
	}
	
	public static void main(String[] args) {
		thismeth thismeth = new thismeth();
		thismeth.add();
	}
}
