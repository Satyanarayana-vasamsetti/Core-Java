
public class arr7 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int i=0;
		while(i<5) {
			System.out.println(a[i]);
			i++;
		}
		System.out.println(" ");
		int j=4;
		while(j>=0) {
			System.out.println(a[j]);
			j--;
		}
		System.out.println(" ");
		int k=0;
		do {
			System.out.println(a[k]);
			k++;
		}while(k<a.length);
	}
}
