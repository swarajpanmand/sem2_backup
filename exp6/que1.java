package exp6;

import java.util.Calendar;
import java.util.Scanner;

// Parent class representing a bank
class Bank {
    double interest;
    double principal, rate, time;

    // Default method to get the interest rate
    double get_rate_of_interest() {
        rate = 2;
        return rate;
    }
}

// Subclass representing SBI Bank
class SBI_Bank extends Bank {
    // Constructor to initialize principal and time
    SBI_Bank(double principal, double time) {
        this.principal = principal;
        this.time = time;
        get_rate_of_interest(time); // Call method to set interest rate based on time
    }

    // Method to calculate interest
    public double calculate_interest() {
        interest = principal * (Math.pow((1 + rate / 100), time));
        return interest;
    }

    // Method to set interest rate based on time
    double get_rate_of_interest(double time) {
        // Setting interest rates based on the time period
        if (time >= 7 && time <= 14) {
            rate = 3;
            return rate;
        } else if (time >= 15 && time <= 30) {
            rate = 3;
            return rate;
        } else if (time >= 31 && time <= 45) {
            rate = 3;
            return rate;
        } else if (time >= 46 && time <= 90) {
            rate = 4.05;
            return rate;
        } else if (time >= 91 && time <= 120) {
            rate = 4.10;
            return rate;
        } else if (time >= 121 && time <= 180) {
            rate = 4.10;
            return rate;
        } else {
            return 0;
        }
    }
}

// Subclass representing ICICI Bank
class ICICI_Bank extends Bank {
    // Constructor to initialize principal and time
    ICICI_Bank(double principal, double time) {
        this.principal = principal;
        this.time = time;
        get_rate_of_interest(time); // Call method to set interest rate based on time
    }

    // Method to calculate interest
    public double calculate_interest() {
        interest = principal * (Math.pow((1 + rate / 100), time));
        return interest;
    }

    // Method to set interest rate based on time
    double get_rate_of_interest(double time) {
        // Setting interest rates based on the time period
        if (time >= 7 && time <= 14) {
            rate = 3.10;
            return rate;
        } else if (time >= 15 && time <= 30) {
            rate = 3.20;
            return rate;
        } else if (time >= 31 && time <= 45) {
            rate = 3.50;
            return rate;
        } else if (time >= 46 && time <= 90) {
            rate = 4.50;
            return rate;
        } else if (time >= 91 && time <= 120) {
            rate = 4.70;
            return rate;
        } else if (time >= 121 && time <= 180) {
            rate = 4.90;
            return rate;
        } else {
            return 0;
        }
    }
}

// Subclass representing AXIS Bank
class AXIS_Bank extends Bank {
    // Constructor to initialize principal and time
    AXIS_Bank(double principal, double time) {
        this.principal = principal;
        this.time = time;
        get_rate_of_interest(time); // Call method to set interest rate based on time
    }

    // Method to calculate interest
    public double calculate_interest() {
        interest = principal * (Math.pow((1 + rate / 100), time));
        return interest;
    }

    // Method to set interest rate based on time
    double get_rate_of_interest(double time) {
        // Setting interest rates based on the time period
        if (time >= 7 && time <= 14) {
            rate = 3.15;
            return rate;
        } else if (time >= 15 && time <= 30) {
            rate = 3.15;
            return rate;
        } else if (time >= 31 && time <= 45) {
            rate = 3.45;
            return rate;
        } else if (time >= 46 && time <= 90) {
            rate = 4.05;
            return rate;
        } else if (time >= 91 && time <= 120) {
            rate = 4.70;
            return rate;
        } else if (time >= 121 && time <= 180) {
            rate = 5.00;
            return rate;
        } else {
            return 0;
        }
    }
}

// Test class
class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first date (YYYY MM DD):)");
        int year1 = sc.nextInt();
        int month1 = sc.nextInt();
        int date1 = sc.nextInt();

        System.out.println("Enter the second date (YYYY MM DD):)");
        int year2 = sc.nextInt();
        int month2 = sc.nextInt();
        int date2 = sc.nextInt();

        // Creating Calendar instances for date calculation
        Calendar cal1 = Calendar.getInstance();
        cal1.set(year1, month1 - 1, date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(year2, month2 - 1, date2);

        // Calculating difference in days
        long differenceInMillis = Math.abs(cal2.getTimeInMillis() - cal1.getTimeInMillis());
        long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);

        // Calculating time in years
        long time = differenceInDays / 365;

        // Creating bank objects with principal and time
        SBI_Bank b1 = new SBI_Bank(10000, time);
        ICICI_Bank b2 = new ICICI_Bank(12500, time);
        AXIS_Bank b3 = new AXIS_Bank(20000, time);

        // Printing calculated interest amounts for each bank
        System.out.printf("Amount for SBI Bank is %.2f", b1.calculate_interest());
        System.out.println("");
        System.out.printf("Amount for ICICI Bank is %.2f", b2.calculate_interest());
        System.out.println("");
        System.out.printf("Amount for AXIS Bank is %.2f", b3.calculate_interest());
        System.out.println("");
    }

}
