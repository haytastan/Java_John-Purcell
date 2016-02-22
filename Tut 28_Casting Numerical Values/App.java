public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;

		float floatValue = 8834.8f; // f needed
		float floatValue2 = (float) 99.3;
		double doubleValue = 32.4;

		int inval = (int) doubleValue; // int inval = (int) 32.4;
		// downcasting oldu�u i�in yani sa�daki soldakine  
		// �evrilece�i i�in teyit etmemiz isteniyor. 
		System.out.println(inval);
		
		double doubval = intValue; 
		// upcasting oldu�u i�in paranteze gerek yok
		System.out.println(doubval);

		System.out.println(Byte.MAX_VALUE);
		// class versions of primitives needed to calculate min and max values

		intValue = (int) longValue;
		// sa�daki soldakini etkiliyor 
		// ve sa�daki mertebe olarak yukar�da ise downcasting yap�l�yor
		
		System.out.println(intValue);

		doubleValue = intValue;
		System.out.println(doubleValue);

		intValue = (int) floatValue;
		System.out.println(intValue);

		// The following won't work as we expect it to!!
		// 128 is too big for a byte.
		byteValue = (byte) 128;
		System.out.println(byteValue);

	}

}