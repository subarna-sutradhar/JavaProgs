// 3.Define an interface Motor with a data member –capacity and two methods such as run() and consume(). Define a
// Java class „Washing machine‟ which implements this interface and write the code to check the value of the interface

// data member through an object of the class.
package lab9_6April;

interface Motor {
    int capacity = 15; 

    void run(); 
    void consume(); 
}


class WashingMachine implements Motor {
    
    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Washing machine is consuming electricity.");
    }
}


public class prog3 {
    public static void main(String[] args) {
        
        WashingMachine washingMachine = new WashingMachine();

        System.out.println("Motor capacity of washing machine: " + washingMachine.capacity);
        
        washingMachine.run();
        washingMachine.consume();
    }
}