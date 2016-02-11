// import java.io.IOException;

public class Test {

    public void run() throws ServerException {
    	// "throws" is a kw and written lower case
		// whereas "ServerException" is upper case being a class
        
        // Some kind of return value from some complex process!
        // 0 = success
        // anything else = error code
        int code = 1;
        
        if(code != 0) {
            // Something's wrong!
        	
            //throw new IOException("Could not connect to server.");
        	// IOException class � yarat�lmadan java.io.IOException import edilebilir
        	
            throw new ServerException("Could not connect to server.");
            // main method taraf�ndan run metodu �a�r�ld���ndan 
    		// ServerException f�rlat�ld� (?). 
            
            // exits the method 
            
            // e�er sadece print edilseydi outputta "Running successfully." yaz�s� da g�z�kecekti
        }
        
        System.out.println("Running successfully.");
    }
}