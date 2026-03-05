class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class Q2 {
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException(number + " is an odd number!");
        }
        System.out.println(number + " is even. Proceeding...");
    }

    public static void main(String[] args) {
        int testValue = 7;
        try {
            checkEven(testValue);
        } catch (OddNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
