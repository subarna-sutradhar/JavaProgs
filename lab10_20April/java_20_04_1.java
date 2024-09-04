public class java_20_04_1 {
    public static void processInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number cannot be negative");
        }
        else {
            int doubleValue = number * 2;
            System.out.println("Double value of " + number + " is " + doubleValue);
        }
    }
    public static void main(String[] args) {
        try {
            processInput(5);
            processInput(-2);
        }
        catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

