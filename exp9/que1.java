package exp9;

import java.util.*;

abstract class Account{
	String name;
	double balance;
	int acc_no;
	
	abstract double deposit();
	abstract double withdraw();
	abstract void display();

}

class SavingAccount extends Account{
	double interestRate;
	double minBalance=0;
	
	SavingAccount(String name, double balance, int acc_no){
		this.name= name;
		this.balance = balance;
		this.acc_no = acc_no;
	}
	
	public double deposit(double depositAmount){
		balance= balance + depositAmount;
		return balance;
	}
	public double withdraw(int withdrawAmount){
		try{
			balance = balance - withdrawAmount;
			System.out.println("Withdraw successful:)");
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception.");
			
		}
	}
	public void display(){
		System.out.println("");
		
	}
	double addInterest(){
		System.out.println();
	}
	double transfer(){
		System.out.println();
	}
}

class TestAccount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name of the Customer: ");
		String name = sc.next();
		System.out.print("Enter the balance: ");
		double balance = sc.nextDouble();
		System.out.print("Enter the Account number: ");
		int acc_no = sc.nextInt();
		SavingAccount sa = new SavingAccount(name, balance, acc_no);
		
		System.out.println("1.Deposit\n2.Withdraw\n3.Add Interest\n4.Transfer");
		int n = sc.nextInt();
		switch (n){
			case 1:
				System.out.print("Enter the amount: ");
				double depositAmount = sc.nextDouble();
				sa.deposit();
				break;
			case 2:
				System.out.print("Enter the amount: ");
				double withdrawAmount = sc.nextDouble();
				sa.withdraw();
				break;
			  case 3:
				System.out.println("");
				sa.addInterest();
				break;
			case 4:
				sa.transfer();
				break;
		}
		
	}
}