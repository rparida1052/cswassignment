package assignment1.Q7;

// Account class


// SavingsAccount class
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Override deposit method to calculate interest
    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate / 100;
    }

    // Override withdrawal method to ensure sufficient balance
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// CurrentAccount class
class CurrentAccount extends Account {
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {

    }

    // Override withdrawal method to check overdraft limit
    @Override
    public void withdraw(double amount) {
        double availableBalance = getBalance() + overdraftLimit;
        if (amount <= availableBalance) {
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit");
        }
    }
}

// BankingApplication class (Main)
public class BankingApplication {
    public static void main(String[] args) {
        // Create instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000.0, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 2000.0, 500.0);

        // Deposit and withdraw from SavingsAccount
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);

        // Deposit and withdraw from CurrentAccount
        currentAccount.deposit(300.0);
        currentAccount.withdraw(2500.0);

        // Display account details
        displayAccountDetails(savingsAccount);
        displayAccountDetails(currentAccount);
    }

    // Method to display account details
    public static void displayAccountDetails(Account account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println();
    }
}

