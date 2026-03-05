package ExceptionHandlingDemo;

public class DivisionException extends Exception {
    public DivisionException(String message) {
        super(message);
    }
}




package ExceptionHandlingDemo;

public class Calculator {
    public void divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            calc.divide(10, 0); // Triggers custom exception
        } catch (DivisionException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}