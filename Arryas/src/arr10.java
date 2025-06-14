import java.util.Arrays;

public class arr10 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		System.out.println(a);//[I@24d46ca6 hashcode or hexadecimal
		System.out.println(Arrays.toString(a));//[1, 2, 3, 4, 5, 6]
		Arrays.fill(a, 143);
		System.out.println(Arrays.toString(a));
		
		int aa[]= {1,2,3};
		int bb[]= {1,2,3};
		System.out.println(Arrays.equals(aa,bb));//true
		System.out.println(aa.equals(bb));//false
	}
}
