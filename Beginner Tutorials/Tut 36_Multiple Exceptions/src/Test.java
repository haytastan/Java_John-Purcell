import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException; // 2

public class Test {
	public void run() throws IOException, ParseException { // 3
		// one exception at a time is thrown
		
		// amac�m�z program y�r�t�ld���nde kodun ba�ar�l� olmas�
		// ve exception f�rlatmamak

		// throw new IOException();
		// IOException()'�n run metodunun farkl� bir yerinde oldu�unu
		// d���n�yoruz
		// if statement, while loop vs ile yeri belirlenmi� olabilir

		throw new ParseException("Error in command list.", 2); // 1
		// main method taraf�ndan run metodu �a�r�ld���ndan 
		// ParseException f�rlat�ld� (?). 
	}

	public void input() throws IOException, FileNotFoundException {
		throw new FileNotFoundException("File not found");
	}
}