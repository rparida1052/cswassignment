package assignment2.Q1;
class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: $" + balance;
    }
}

class BankApp {
    public Account createAccount(int accountNumber) {
        return new Account(accountNumber);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void displayAccountInfo(Account account) {
        System.out.println(account.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        BankApp bankApp = new BankApp();
        Account account1 = bankApp.createAccount(123456);
        Account account2 = bankApp.createAccount(789012);

        bankApp.deposit(account1, 1000);
        bankApp.deposit(account2, 500);

        bankApp.displayAccountInfo(account1);
        bankApp.displayAccountInfo(account2);

        bankApp.withdraw(account1, 200);
        bankApp.withdraw(account2, 800);

        bankApp.displayAccountInfo(account1);
        bankApp.displayAccountInfo(account2);
    }
}

