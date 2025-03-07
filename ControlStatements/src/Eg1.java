
public class Eg1 {
	public static void main(String[] args) {
		Eg1	eg1=new Eg1();
		eg1.order();
	}
	public void customerName(String customerName) {
		System.out.println("Customer Name : "+customerName);
	}
	public String coupn() {
		return "98A54F";
	}
	public void order() {
		customerName("Satyanarayana");
		String productName = "DairyMilk";
		System.out.println("Product Name : "+productName);
		double price = 180.0;
		System.out.println("Original Price :"+price);
		double discount;
		if(coupn().equals("98A54F")) {
			discount = 0.1;
		}
		else {
			discount = 0.0;
		}
		System.out.println("Discount : "+(price*discount));
		double finalPrice = price - (price*discount);
		System.out.println("Final Price : "+finalPrice);
	}
}
