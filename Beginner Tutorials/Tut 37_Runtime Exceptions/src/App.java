public class App {

	public static void main(String[] args) {
		// exceptionlar runtime (unchecked) exceptions
		// ve checked exceptions olmak �zere ikiye ayr�l�r.
		// checked exception kullan�c� taraf�ndan �stesinden gelinmelidir
		// (try-catch block veya throws declaration ile)
		// runtimeexception var ise compile edilebilir ancak program�n kendisi
		// hata verir
		// runtimeexception var ise try-catch block vs. kullan�labilse de
		// genelde programda �nemli bir hata vard�r ve hatay� d�zeltmek gerekir
		// bu y�zden program runtimeexception verirse bizi bu exception�
		// yakalamaya
		// zorlamaz

		// Null pointer exception ....
		String text = null;

		System.out.println(text.length()); // try-catch block kullan�lmadan compile edildi ama y�r�medi

		// Arithmetic exception ... (divide by zero)
		int value = 7 / 0;

		// despite not common (cause we are not forced to and runtime exceptions
		// are fundamental)
		// if the program throws runtime exceptions
		// You can actually handle/check/catch RuntimeExceptions if you want to;
		// for example, here we handle an ArrayIndexOutOfBoundsException
		String[] texts = { "one", "two", "three" };

		try {
			System.out.println(texts[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// more general:
			// catch (RuntimeException e)
			// catch (Exception e)
			System.out.println(e.toString());
			// alternatifler:
			// e.printStackTrace();
			// System.out.println(e.getMessage());
		}
	}
}
/*
 Exception in thread "main" java.lang.NullPointerException
	at App.main(App.java:19)
 */
