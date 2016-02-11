// kendi exception�m�z yarat�labilir
public class ServerException extends Exception {
	// we could have made server exception extend the IO exception
	
    public ServerException(String message) {
    	// constructor from super class has been created
    	
    	// super kw static bir class name (Exception) olarak d���n�lebilir
        super(message);
        // method (constructor) of super class (Exception class) has been called
    }

}