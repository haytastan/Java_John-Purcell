// import java.io.IOException;

public class App {

	public static void main(String[] args) {

		Test test = new Test();

		try {
			test.run();
		} catch (ServerException e) {
			System.out.println(e.getMessage());
			// siyah renkte "Could not connect to server" yaz�s�n�n ��kmas�n� sa�lar
			
			e.printStackTrace();
			// k�rm�z� renkteki stack trace yaz�s�n�n ��kmas�n� sa�l�yor
		}

	}

}
