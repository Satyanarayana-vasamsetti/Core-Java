import java.io.File;
import java.io.IOException;

public class throwsss {
	public static void main(String[] args) throws IOException {
		File file = new File("one.txt");
		file.createNewFile();
	}
}
