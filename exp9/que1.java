import java.util.*;

// Abstract class representing an Account
abstract class Account {
    String name;
    double balance;
    int acc_no;

    // Constructor
    public Account(String name, double balance, int acc_no) {
        this.name = name;
        this.balance = balance;
        this.acc_no = acc_no;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void display();
}

// Subclass representing a Savings Account
class SavingAccount extends Account {
    double interestRate;
    double minBalance;

    // Constructor
    SavingAccount(String name, double balance, int acc_no, double interestRate, double minBalance) {
        super(name, balance, acc_no);
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Error: Amount cannot be negative.");
            return;
        }
        balance = balance + amount;
        System.out.println("Deposit successful:) new balance: " + balance);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Error: Amount cannot be negative.");
            return;
        }
        if (balance - amount < minBalance) {
            System.out.println("Error: Insufficient balance.");
            return;
        }
        if (minBalance != 0 && balance - amount < minBalance) {
            System.out.println("Error: Minimum balance not maintained.");
            return;
        }
        balance = balance - amount;
        System.out.println("Withdraw successful:) new balance: " + balance);
    }

    // Method to display account information
    public void display() {
        System.out.println("Account name: " + name);
        System.out.println("Account number: " + acc_no);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Minimum balance: " + minBalance);
    }

    // Method to add interest to the account balance
    public void addInterest() {
        try {
            double interest = balance * interestRate / 100;
            balance = balance + interest;
            System.out.println("Interest added successfully:) new balance: " + balance);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception.");
        }
    }

    // Method to transfer money between accounts
    public void transfer(double amount, Account acc) {
        if (amount < 0) {
            System.out.println("Error: Amount cannot be negative.");
        }
        if (balance - amount < minBalance) {
            System.out.println("Error: Insufficient balance.");
        }
        if (minBalance != 0 && balance - amount < minBalance) {
            System.out.println("Error: Minimum balance not maintained.");
        }
        balance = balance - amount;
        acc.balance = acc.balance + amount;
        System.out.println("New balance: " + balance);
    }
}

// Main class
class que1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the Customer: ");
        String name = sc.next();
        System.out.print("Enter the balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter the Account number: ");
        int acc_no = sc.nextInt();
        System.out.print("Enter the interest rate: ");
        double interestRate = sc.nextDouble();
        System.out.print("Enter the minimum balance: ");
        double minBalance = sc.nextDouble();
        SavingAccount sa = new SavingAccount(name, balance, acc_no, interestRate, minBalance);

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display\n4. Add Interest\n5. Transfer\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    sa.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    sa.withdraw(withdrawAmount);
                    break;
                case 3:
                    sa.display();
                    break;
                case 4:
                    sa.addInterest();
                    break;
                case 5:
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = sc.nextDouble();
                    System.out.print("Enter target account number: ");
                    int targetAccNo = sc.nextInt();
                    // For simplicity, assuming we're transferring to the same account here
                    SavingAccount targetAccount = sa;
                    sa.transfer(transferAmount, targetAccount);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
        sc.close();
    }
}
