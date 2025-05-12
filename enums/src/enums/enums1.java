package enums;

enum Gender{
	MALE,FEMALE
}
enum Books{
	JAVA,JAVASCRIPT,SPRING
}
public class enums1 {
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		//here what valueOf() return is display value if present
		//other wise prompt error
		System.out.println(Books.valueOf("JAVA"));
		//values() return values of enum
		//ordinal() return index values
		Books[] values = Books.values();
		for(Books book : values) {
			System.out.println(book + " " +book.ordinal());
		}
	}
}
