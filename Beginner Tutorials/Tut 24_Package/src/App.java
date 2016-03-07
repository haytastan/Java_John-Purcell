// package hem d�zen verir 
// hem de farkl� package'de bulunan iki class isminin ayn� olmas�na m�saade eder
import ocean.Fish;
// we are importing fish class from the ocean package
// ocean package'i nitelerken fish class'� niteler
// package windows'daki folder gibidir, class ise file.
// windows explorer'daki slash�n aksine nokta ile ayr�l�r
import ocean.plants.Seaweed;
// farkl� package'de bulunan class �a�r�lacak ise public bile olsa import edilmek zorunda
// import ocean.*; -> import any class from the package ocean

public class App {
    
    public static void main(String[] args) {
        Fish fish = new Fish();
        Seaweed weed = new Seaweed();
    }

}
