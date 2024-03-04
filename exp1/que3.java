package exp1;

import java.util.*;

class Bank {
    String name;
    int number;
    String type;
    float balance;

    int deposit(String name, int balance, int depo) {
        balance = balance + depo;
        display(name, balance);
        return balance;
    }

    int withdraw(String name, int balance, int with) {
        if (balance > with) {
            balance = balance - with;
        } else {
            System.out.println("Balance is low");
        }
        display(name, balance);
        return balance;
    }

    void display(String name, int balance) {
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter account type: ");
        String type = sc.next();
        System.out.print("Enter balance: ");
        int balance = sc.nextInt();

        Bank bank = new Bank();

        System.out.println("1. Deposit\n2. Withdraw");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.print("Enter deposit amount: ");
                int depo = sc.nextInt();
                bank.deposit(name, balance, depo);
                break;
            case 2:
                System.out.print("Enter withdraw amount: ");
                int with = sc.nextInt();
                bank.withdraw(name, balance, with);
                break;
            default:
                System.out.println("Error");
        }
    }
}
