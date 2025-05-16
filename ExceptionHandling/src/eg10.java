public class eg10 {
	@SuppressWarnings("finally")//type 2
	public static void main(String[] args) {
		try {
			System.out.println("Try block");
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Catch block " +e);
		}finally {
			System.out.println("finally block");
			throw new RuntimeException();
//			try {
//				System.out.println("finally block");
//				throw new RuntimeException();
//			} catch (Exception e2) {
//				System.out.println("catch error "+e2);
//			}
			
		}
	}
}
