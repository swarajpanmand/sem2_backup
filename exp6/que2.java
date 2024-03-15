import java.util.*;

// Parent class representing an organization
class Organisation {
    double basic = 50000; // Default basic salary
    double da = basic * 0.28; // Dearness Allowance
    double hra = basic * 0.08; // House Rent Allowance
    double basic_hour = 843; // Basic hourly rate
    
    // Method to calculate salary (Default implementation)
    double salary() {
        return basic; // Return default basic salary
    }
}

// Subclass representing teaching staff
class Teaching extends Organisation {
    int n;
    int k;
    int hours;

    // Constructor to initialize teaching staff
    Teaching(int n, int k, int hours) {
        this.n = n;
        this.k = k;
        this.hours = hours;
    }

    // Method to calculate salary for teaching staff
    @Override
    double salary() {
        if (n == 1) {
            basic = basic + da + hra; // Permanent teaching staff
        } else {
            if (k == 0) {
                basic = hours * basic; // Hourly paid teaching staff
            }
        }
        return basic; // Return calculated salary
    }
}

// Subclass representing non-teaching staff
class NonTeaching extends Organisation {
    int n;
    int k;
    int hours;
    
    // Default constructor
    NonTeaching() {
    }
}

// Subclass representing technical staff
class Technical extends NonTeaching {
    // Method to calculate salary for technical staff
    @Override
    double salary() {
        basic = basic + da + hra; // Calculate salary with DA and HRA
        return basic; // Return calculated salary
    }
}

// Subclass representing non-technical staff
class NonTechnical extends NonTeaching {
    // Constructor to initialize non-technical staff
    NonTechnical(int n, int k, int hours) {
        this.n = n;
        this.k = k;
        this.hours = hours;
    }

    // Method to calculate salary for non-technical staff
    @Override
    double salary() {
        if (n == 1) {
            basic = basic + da + hra; // Permanent non-technical staff
        } else {
            if (k == 1) {
                return basic; // Hourly paid non-technical staff
            } else {
                return hours * basic_hour; // Athoc non-technical staff
            }
        }
        return basic; // Return calculated salary
    }
}

// Main class
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for employee category (Teaching or Non-Teaching)
        System.out.print("Is the employee categorized TEACHING or NON-TEACHING (1 for teaching, 0 for non-teaching)> ");
        int emp = sc.nextInt();
        
        // For Teaching staff
        if (emp == 1) {
            // Input for permanent or athoc teaching staff
            System.out.print("Is the employee PERMANENT or ATHOC (1 for permanent, 0 for athoc)> ");
            int per_athoc = sc.nextInt();
            int full_vis, hours;
            if (per_athoc == 0) {
                // Input for full time or visiting teaching staff
                System.out.print("Is ATHOC full time or visiting (1 for full time, 0 for visiting)> ");
                full_vis = sc.nextInt();
                System.out.print("Enter the hours: ");
                hours = sc.nextInt();
            } else {
                full_vis = 0;
                hours = 0;
            }
            // Create Teaching object
            Teaching teach = new Teaching(per_athoc, full_vis, hours);
            System.out.println("Salary of the employee is "+teach.salary());
        } 
        // For Non-Teaching staff
        else {
            // Input for technical or non-technical staff
            System.out.print("Is the employee TECHNICAL or NONTECHNICAL (1 for tech, 0 for non-tech)> ");
            int tec_non = sc.nextInt();
            if (tec_non == 0) {
                // Input for permanent or athoc non-technical staff
                System.out.print("Is the employee PERMANENT or ATHOC (1 for permanent, 0 for athoc)> ");
                int per_athoc1 = sc.nextInt();
                int full_vis1, hours1;
                if (per_athoc1 == 0) {
                    // Input for full time or visiting non-technical staff
                    System.out.print("Is ATHOC full time or visiting (1 for full time, 0 for visiting)> ");
                    full_vis1 = sc.nextInt();
                    System.out.print("Enter the hours: ");
                    hours1 = sc.nextInt();
                } else {
                    full_vis1 = 0;
                    hours1 = 0;
                }
                // Create NonTechnical object
                NonTechnical nontec = new NonTechnical(tec_non, full_vis1, hours1);
                System.out.println("Salary of the employee is "+nontec.salary());
            } 
            // For Technical staff
            else {
                // Create Technical object
                Technical tec = new Technical();
                System.out.println("Salary of the employee is "+tec.salary());
            }
        }
    }
}
