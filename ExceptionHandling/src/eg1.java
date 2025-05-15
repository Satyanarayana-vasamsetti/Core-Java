
public class eg1 {
	public static void main(String[] args) {
		//1
		try {
			System.out.println("Try Block");
		} catch (Exception e) {
			System.out.println("Catch block");
		}
		//2
		try {
			System.out.println("Try block");
		} finally {
			System.out.println("final block");
		}
		//3
		try {
			System.out.println("Handle business logic");
		} catch (Exception e) {
			System.out.println("Handle errors");
		}finally {
			System.out.println("we close resources");
		}
		//to avoid finally(yes its possible)
		try {
			System.out.println("Try block");
		} finally {
			System.exit(0);
			System.out.println("final block");
		}
	}
}
