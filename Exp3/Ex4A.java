import java.util.Scanner;

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if ((balance - amount) < 100) {
            System.out.println("Minimum balance of 100 must be maintained");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}

public class Ex4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        SavingsAccount s = new SavingsAccount(bal);

        System.out.print("Enter deposit amount: ");
        s.deposit(sc.nextDouble());

        System.out.print("Enter withdraw amount: ");
        s.withdraw(sc.nextDouble());
    }
}