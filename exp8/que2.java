import java.util.*;
import java.lang.Math;

// Interface for saving account
interface SavingAccount {
    void getSimpleInterest(); // Method to calculate and display simple interest
}

// Interface for current account
interface CurrentAccount {
    void getCompoundInterest(); // Method to calculate and display compound interest
}

// Class representing a customer, implementing both SavingAccount and CurrentAccount interfaces
class Customer implements SavingAccount, CurrentAccount {
    private String type; // Account type
    private double rate; // Interest rate
    private double balance; // Account balance
    private int time; // Time period

    // Constructor to initialize account details
    Customer(String type, double rate, double balance, int time) {
        this.type = type;
        this.rate = rate;
        this.balance = balance;
        this.time = time;
    }

    // Method to calculate and display simple interest
    public void getSimpleInterest() {
        System.out.printf("Simple Interest after " + time + " year: %.2f", ((balance * rate * time) / 100));
        System.out.println("");
    }

    // Method to calculate and display compound interest
    public void getCompoundInterest() {
        double inte = balance * Math.pow(1 + (rate / 100), time); // Calculate compound interest
        System.out.printf("Compound Interest after " + time + " year: %.2f", (inte - balance));
        System.out.println("");
    }
}

// Test class to take user input and demonstrate interest calculation
class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account type (Saving/Current): ");
        String type = sc.next(); // Input account type
        System.out.print("Enter the balance: ");
        double balance = sc.nextDouble(); // Input account balance
        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble(); // Input interest rate
        System.out.print("Enter the time: ");
        int time = sc.nextInt(); // Input time period

        // Create Customer object with input details
        Customer cust = new Customer(type, rate, balance, time);

        // Display interest based on account type
        if (type.equalsIgnoreCase("Saving")) {
            cust.getSimpleInterest(); // Calculate and display simple interest
        } else if (type.equalsIgnoreCase("Current")) {
            cust.getCompoundInterest(); // Calculate and display compound interest
        } else {
            System.out.println("Invalid account type."); // Display message for invalid account type
        }
    }
}
