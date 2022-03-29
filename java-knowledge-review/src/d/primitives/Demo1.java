package d.primitives;

public class Demo1 {

	public static void main(String[] args) {
		
		// primitives has value only
		// primitive type:
		// integers: byte, short, int, long
		byte a = 10; // 8 bit 		[00000000] bit is short for Binary DigiT
		short b = 100; // 16 bit 	[0000000000000000]
		int c = 200; // 32 bit  	[00000000000000000000000000000000]
		long d = 3_000; // 64 bit 	[0000000000000000000000000000000000000000000000000000000000000000]
		// min / max values
		System.out.println("byte min: " + Byte.MIN_VALUE);
		System.out.println("byte max: " + Byte.MAX_VALUE);
		System.out.println("int min: " + Integer.MIN_VALUE);
		System.out.println("int max: " + Integer.MAX_VALUE);
		
		// decimals: float, double
		float f1 = 5.12F; // 32 bit	[00000000000000000000000000000000]
		double f2 = 5.3; // 64 bit	[0000000000000000000000000000000000000000000000000000000000000000]
		
		// logical: boolean
		boolean b1 = true;
		
		// text: char
		char c1 = 'A';
		char c2 = 'B';
		char c3 = 'C';
		char c4 = 'D';
		
		// String is an object - not primitive
		// objects has - attributes and methods
		String str = "aaa";
		System.out.println("string length: " + str.length()); // attribute
		char firstChar = str.charAt(0); // method
		
		// literals
		System.out.println(5); // 5 is literal int
		System.out.println(5.3); // 5.3 is literal double
		System.out.println("aaa"); // "aaa" is literal String
		System.out.println(true); // true is literal boolean
		System.out.println(false); // false is literal boolean
		
		// if we use suffix D, F, L we can get literals of other types
		System.out.println(100D);  // 100D is literal double
		System.out.println(100F);  // 100F is literal float
		System.out.println(100L);  // 100L is literal long
		
		
		System.out.println("========== casting");
		// casting - convert from one type to another
		// cast operator: (type)
		int number = 128;
		byte smallNumber = (byte)number; // cast from int to byte - danger of overflow
		System.out.println(smallNumber);
		

	}

}
