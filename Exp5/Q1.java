// Custom Exception for Low Balance
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// Custom Exception for Negative Inputs
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance: $" + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit a negative amount.");
        }
        balance += amount;
        System.out.println("Successfully deposited: $" + amount);
    }

    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw a negative amount.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient funds! Current balance: $" + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew: $" + amount);
    }
}

public class Q1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            account.balanceEnquiry();
            account.deposit(200);
            account.withdraw(800); // This will trigger LowBalanceException
        } catch (LowBalanceException | NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt finished.");
        }
    }
}