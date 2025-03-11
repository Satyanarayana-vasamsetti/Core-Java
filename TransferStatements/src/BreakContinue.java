import java.util.ArrayList;

public class BreakContinue {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) {
//				break;
				continue;
			}
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		System.out.println(list);
		for(int j=0;j<list.size();j++) {
			String name = list.get(j);
			if(name.equals("Two")) {
//				break;
				continue;
			}
			System.out.println(list.get(j));
		}
	}
}
