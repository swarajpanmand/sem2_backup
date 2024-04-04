package exp8;
import java.util.*;

abstract class Account{
	String name;
	double balance;
	int acc_no;

    public Account(String name, double balance, int acc_no) {
        this.name = name;
        this.balance = balance;
        this.acc_no = acc_no;
    }
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void display();

}

class SavingAccount extends Account{
	double interestRate;
	double minBalance;
	
	SavingAccount(String name, double balance, int acc_no, double interestRate, double minBalance){
        super(name, balance, acc_no);
		this.interestRate = interestRate;
        this.minBalance = minBalance;
	}
	
	public void deposit(double amount){
        if (amount<0){
            System.out.println("Error: Amount cannot be negative.");
            return;
        }
		balance = balance + amount;
		System.out.println("Deposit successful:) new balance: " + balance);
	}
	public void withdraw(double amount){
		if(amount<0){
            System.out.println("Error: Amount cannot be negative.");
            return;
        }
        if(balance-amount<minBalance){
            System.out.println("Error: Insufficient balance.");
            return;
        }
        if(minBalance!=0 && balance-amount<minBalance){
            System.out.println("Error: Minimum balance not maintained.");
            return;
        }
        balance = balance - amount;
        System.out.println("Withdraw successful:) new balance: " + balance);
	}
	public void display(){
		System.out.println("Account name: " + name);
        System.out.println("Account number: " + acc_no);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Minimum balance: " + minBalance);
		
	}
	public void addInterest(){
		try{
            double interest = balance * interestRate / 100;
            balance = balance + interest;
            System.out.println("Interest added successfully:) new balance: " + balance);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception.");
        }
	}
	public void transfer(double amount, Account acc){
        if(amount<0){
            System.out.println("Error: Amount cannot be negative.");
            return 0;
        }
        if(balance-amount<minBalance){
            System.out.println("Error: Insufficient balance.");
            return 0;
        }
        if(minBalance!=0 && balance-amount<minBalance){
            System.out.println("Error: Minimum balance not maintained.");
            return 0;
        }
        balance = balance - amount;
        acc.balance = acc.balance + amount;
        System.out.println("Transfer successful:) new balance: " + balance);
		
	}
}

class que5{
	public static void main(String args[]){
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
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    sa.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
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
                    double transferAmount = scanner.nextDouble();
                    System.out.print("Enter target account number: ");
                    int targetAccNo = scanner.nextInt();
                    // For simplicity, assuming we're transferring to the same account here
                    SavingAccount targetAccount = sa;
                    savingsAccount.transfer(transferAmount, targetAccount);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
        scanner.close();
	}
}