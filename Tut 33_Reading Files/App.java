import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
    	// either use double back slash or forward slash 
    	// to avoid confusion declaring file location
       //  String fileName = "C:\\Users\\Sinan\\Desktop\\Java.txt";
        
        // we could also drag the file into project folder and not specify the full path
        String fileName = "Java.txt";
        // di�er alternatif ise right click -> new -> file
        
        // we are creating a file object
        // which is a java representation of our file
        File textFile = new File(fileName);
        // java.io.File is imported
        
        // since it threw an exception
        // throws declaration was added
        // other alternative was surrounding with try/catch block
        Scanner in = new Scanner(textFile);
        // java.util.Scanner has been imported
        
        // if we work with other methods of scanner 
        // and read integers from file
        int value = in.nextInt();
        System.out.println("Read value: " + value);
                
        in.nextLine(); 
        // to prevent the invisible character that integer doesn't read
        // we are reading the character and discarding it 
        
        // we are looping so that we read the file line by line
        // text documenttaki int de string olarak okunabilir
        int count = 2;
        // while loop esnas�nda count variable kullan�lmak zorunda de�ildi
        // count variable kullan�lmadan while loop yerine if statement
        // kullan�lsayd� 1 kere print edilecekti
        while(in.hasNextLine()) { // while there's another line to read
            String line = in.nextLine(); 
            
            System.out.println(count + ": " + line);
            count++;
        }
        
        in.close();
        // when we open a scanner object we should close it
    }

}