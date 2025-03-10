import java.util.ArrayList;
import java.util.Iterator;

public class WhileLoop {
	public static void main(String[] args) {
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
