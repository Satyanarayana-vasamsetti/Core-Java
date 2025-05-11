package interfaces;
//in interfaces all variables are public static final
//by default 
interface k{
	int y = 10;//by default it is a public static final
	public static final int x = 200;
}
class x implements k{
	
}
public class allvarpsf {
	public static void main(String[] args) {
		System.out.println(x.x);
		System.out.println(x.y);
	}
}
