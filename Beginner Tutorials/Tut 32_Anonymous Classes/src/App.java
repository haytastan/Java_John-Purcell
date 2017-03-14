class Machine { 
    public void start() {
        System.out.println("Starting machine ...");
    }
}

interface Plant {
    public void grow();
}

public class App {

    public static void main(String[] args) {
    	 
        // This is equivalent to creating a class that "extends"
        // Machine and overrides the start method.
        Machine machine1 = new Machine() {
            @Override public void start() {
                System.out.println("Camera snapping ....");
            }
        }; // curly bracket a dikkat
        // e�itli�in sa� taraf� machine class'�n child class'� gibidir (polymorphism)
        // ve anonymous class olarak adland�r�l�r
        
        machine1.start();
        
        // interface being instantiated directly. 
        // that is why we need to implement all abstract methods ourselves.
        // This is equivalent to creating a class that "implements"
        // the Plant interface
        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant growing");
                
            }
        };
        // anonymous class olmasayd� ve Plant plant1 = new Plant(); denseydi
        // interface oldu�u i�in hata verecekti
        
        plant1.grow();
    }
}
/*
Camera snapping ....
Plant growing
*/