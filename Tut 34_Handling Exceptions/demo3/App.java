package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
    	// openFile metodunda try catch block kullan�lsayd� 
    	// main metodda excepting handlinge gerek kalmayacakt�
        try {
            openFile();
        } catch (FileNotFoundException e) {
            // PS. This message is too vague : )
            System.out.println("Could not open file");
            // stack trace yazmak (e.printStackTrace();) user i�in kaba olurmu�
        }
    }
    
    // main method i�erisinde object yaratmamak i�in static dendi
    public static void openFile() throws FileNotFoundException {
        File file = new File("test.txt");

        FileReader fr = new FileReader(file);

    }

}