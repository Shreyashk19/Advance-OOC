// Question 1: BankAccount and SavingsAccount (Method Overriding)

class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) < 100) {
            System.out.println("Withdrawal denied! Minimum balance of 100 required.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(500);
        acc.deposit(200);
        acc.withdraw(550);
        acc.displayBalance();
    }
}
