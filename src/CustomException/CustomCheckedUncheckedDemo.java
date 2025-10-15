// Custom Checked Exception
package CustomException;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom Unchecked Exception
class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}

public class CustomCheckedUncheckedDemo {
    
    // Method that throws a Checked Exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register!");
        } else {
            System.out.println("Age validated successfully!");
        }
    }

    // Method that throws an Unchecked Exception
    public static void checkBalance(double balance) {
        if (balance < 0) {
            throw new NegativeBalanceException("Balance cannot be negative!");
        } else {
            System.out.println("Balance is valid: " + balance);
        }
    }

    public static void main(String[] args) {
        try {
            // Checked Exception
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }

        // Unchecked Exception
        try {
            checkBalance(-5000);
        } catch (NegativeBalanceException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }

        System.out.println("Program continues normally...");
    }
}
