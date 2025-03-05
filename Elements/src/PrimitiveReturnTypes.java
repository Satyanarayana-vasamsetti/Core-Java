//Creating methods using all primitive data types
public class PrimitiveReturnTypes {
	public static void main(String[] args) {
		System.out.println(ByteReturn());
		System.out.println(ShortReturn());
		System.out.println(IntReturn());
		System.out.println(LongReturn());
		System.out.println(FloatReturn());
		System.out.println(DoubleReturn());
		System.out.println(BoolReturn());
		System.out.println(CharReturn());
	}
	public static byte ByteReturn() {
		byte i = 10;
		return i;
	}
	public static short ShortReturn() {
		short i = 20;
		return i;
	}
	public static int IntReturn() {
		int j = 234;
		return j;
	}
	public static long LongReturn() {
		long k = 5;
		return k;
	}
	public static float FloatReturn() {
		float y = 10.3f;
		return y;
	}
	public static double DoubleReturn() {
		double price = 30000;
		return price;
	}
	public static boolean BoolReturn() {
		boolean z = true;
		return true;
	}
	public static char CharReturn() {
		return 'Z';
	}
}
