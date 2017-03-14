import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// kind of the old way to read files with bufferedreader and filereader

public class App {

	public static void main(String[] args) {

		File file = new File("Java.txt");
		// String file = "Java.txt"; yaz�nca hata vermedi
		
		// file fetches the file (scanner class harici gereksiz)
		// filereader reads the file
		// bufferedreader makes the output proper
		
		BufferedReader br = null;
		// bufferedreader � kapat�rken scopeunu geni�letmek i�in d��ar�da
		// tan�mland�

		// filereader exception f�rlat�rsa program catch blocka ve sonras�nda
		// finally block'a gidecek ve bufferedreader de�er alamayacak
		// ve de�eri olmayan bufferedreader� kapatmaya �al��aca��z
		// bu nedenle bufferedreader initialize edildi

		// normal bir applet'te
		// bir�ok metod olaca��ndan a�a��daki exceptionlar catch edilmek
		// yerine muhtemelen throw (2 throw var) edilirdi ki onu �a��ran
		// metod(lar) exception'� yakalas�n
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			// alt olarak i� i�e yaz�labilir:
			// br = new BufferedReader(new FileReader("Java.txt"));

			String line = br.readLine();
			// points one line in a file

			// while loop provides us to read all lines in a file
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			// alt olarak:
			// String line;
			// while ((line = br.readLine()) != null) {
			// System.out.println(line);
			// }

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
			// user don't wanna see stacktrace and they wanna know what file not
			// been found
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
			// in the second exception file is found, however file is corrupted
			// and/or there are permission problems which makes the system
			// unable to read the file
		} finally {
			// yukar�daki exceptionlar throw edilse bile finally block i�indeki
			// kod y�r�t�l�r. 
			// amac�m�z exception f�rlat�lsa bile bufferedreader � kapatmakt�r
			try {
				br.close();
				// we close the file to avoid memory leaks
				// bufferedreader automatically close the file reader

			} catch (IOException e) {
				System.out.println("Unable to close file: " + file.toString());
				// user generally doesn't care if the file was closed
			} catch (NullPointerException ex) {
				// in case file was probably never opened and bufferedreader
				// gets null
				// not: exception throw edilirse try block'daki execution durur
			}
		}

	}

}
/*
first line
second line
third line	
*/