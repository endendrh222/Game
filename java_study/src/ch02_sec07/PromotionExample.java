package ch02_sec07;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println("intValue: " + intValue);
		
		char charValue = 'A';
		intValue = charValue;
		System.out.println(intValue);
		
		//예외		
		byteValue = 65;
		charValue = (char) byteValue;
		
		
		intValue = 50;
		
		//
		long longValue = intValue;
		
		System.out.println(longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println(floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		
		System.out.println(doubleValue);
	}

}
