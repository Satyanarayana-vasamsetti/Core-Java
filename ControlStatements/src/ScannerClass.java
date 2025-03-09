import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		//Open Connection
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = sc.nextInt();
		System.out.println("Enter b value :");
		int b =sc.nextInt();
		//Close connection
		sc.close();
		System.out.println(a);
		System.out.println(b);
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your name :");
			String name = reader.readLine();
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
