package exp7;

import java.util.*;

// Abstract class representing the Westside store
abstract class Westside {
    // Static variables to keep track of available clothes and accessories
    public static int clothes = 10;
    public static int accessories = 10;

    // Default constructor
    Westside() {
    }
}

// Abstract class representing payment
abstract class Payment {
    // Static variable to keep track of available amount
    static double amount = 25000;

    // Default constructor
    Payment() {
    }

    // Abstract method to display payment details
    abstract void paymentDetails();
}

// CashPayment class extending Payment
class CashPayment extends Payment {
    // Constructor
    CashPayment() {
        this.amount = amount;
    }

    // Method to display payment details
    void paymentDetails() {
        System.out.println("Cash Paid.");
    }
}

// CreditCardPayment class extending Payment
class CreditCardPayment extends Payment {
    // Instance variables
    String name;
    int expiration;
    int cardNumber;

    // Constructor
    CreditCardPayment(String name, int expiration, int cardNumber) {
        this.name = name;
        this.expiration = expiration;
        this.cardNumber = cardNumber;
    }

    // Method to display payment details
    void paymentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Expiration: " + expiration);
        System.out.println("Credit Card Details: " + cardNumber);
        System.out.println("Amount Paid.");
    }
}

// Person class representing a customer
class Person {
    // Instance variables
    private String personName;
    private String phoneNumber;

    // Constructor for cash payment
    public Person(String personName, String phoneNumber) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        Payment cp = new CashPayment();
        cp.paymentDetails();
    }

    // Constructor for credit card payment
    public Person(String personName, String phoneNumber, String name, int expiration, int cardNumber) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        Payment ccp = new CreditCardPayment(name, expiration, cardNumber);
        ccp.paymentDetails();
    }

    // Getter for person name
    public String getPersonName() {
        return personName;
    }

    // Getter for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }
}

// Test class to simulate purchases
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int clothes1 = 0;
            int accessories1 = 0;
            int random = 1;

            // Prompt user for number of clothes
            System.out.print("Enter the number of Clothes: ");
            clothes1 = sc.nextInt();
            Westside.clothes = Westside.clothes - clothes1;
            if (Westside.clothes >= 1) {
            } else {
                System.out.println("Clothes were limited, now they are out of stock;)");
            }

            // Prompt user for number of accessories
            System.out.print("Enter the number of Accessories: ");
            accessories1 = sc.nextInt();
            Westside.accessories = Westside.accessories - accessories1;
            if (Westside.accessories >= 1) {
            } else {
                System.out.println("Accessories were limited, now they are out of stock;)");
            }

            // Calculate total amount
            int varForAmount = (clothes1 + accessories1) * 5000;

            // Check if amount is sufficient
            if (varForAmount <= Payment.amount) {
                Payment.amount -= varForAmount;

                // Display amount to be paid
                System.out.println("Amount you have to pay: " + varForAmount);

                // Prompt user for payment method
                System.out.print("Enter the mode of payment(1 for cash payment, 2 for payment using credit card): ");
                int n = sc.nextInt();

                switch (n) {
                    case 1:
                        System.out.println("You have chosen cash payment.");
                        // Create person object with cash payment
                        Person p = new Person("Person" + (random), (random) + "1234567890");
                        random++;
                        break;

                    case 2:
                        System.out.println("You have chosen credit card payment.");
                        System.out.print("Enter the name: ");
                        String name = sc.next();
                        System.out.print("Enter the expiration: ");
                        int expiration = sc.nextInt();
                        System.out.print("Enter the card number: ");
                        int cardNumber = sc.nextInt();
                        // Create person object with credit card payment
                        Person p1 = new Person("Rahul", "1234567890", name, expiration, cardNumber);
                        break;

                    default:
                        System.out.println("You don't have any other choice than cash or credit.");
                }
                System.out.println("");
            } else {
                // If amount is insufficient
                System.out.println("You don't have enough money to buy these items.");
                System.out.println("Clothes remaining: " + Westside.clothes);
                System.out.println("Accessories remaining: " + Westside.accessories);
                System.out.println("Amount remaining: " + Payment.amount);
                if (Payment.amount == 0) {
                    System.out.println("You have no money left.");
                    break;
                }
                if (Westside.clothes == 0 && Westside.accessories == 0) {
                    System.out.println("All items are out of stock.");
                    break;
                }
            }
        }
    }
}
