
public class throwww {
	public static void main(String[] args) throws Exception {
		login("adminn");
	}
	public static void login(String user) throws Exception {
		if(user=="admin") {
			System.out.println(user);
		}else {
			throw new Exception("Invalid user");
		}
	}
}
