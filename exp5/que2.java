package exp2;

import java.util.Scanner;

// Base class representing an Employee
class Employee {
    private String name;
    private String id;
    private int age;

    // Parameterized constructor to initialize Employee data
    public Employee(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Setter and Getter methods for Employee data
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

// Derived class representing a Salaried Employee, inheriting from Employee
class SalariedEmployee extends Employee {
    private double empSalary;
    protected int permanentEmp;

    // Parameterized constructor to initialize SalariedEmployee data and call the base class constructor
    public SalariedEmployee(String name, String id, int age, double empSalary, int permanentEmp) {
        super(name, id, age);
        this.empSalary = empSalary;
        this.permanentEmp = permanentEmp;
    }

    // Getter and Setter methods for SalariedEmployee data
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setPermanentEmp(int permanentEmp) {
        this.permanentEmp = permanentEmp;
    }

    public int getPermanentEmp() {
        return permanentEmp;
    }

    // Method to calculate total salary based on permanent employment status
    public double calculateTotalSalary() {
        if (permanentEmp == 1) {
            return empSalary + 2000; // Incrementing salary for permanent employees
        } else {
            return empSalary;
        }
    }
}

// Main class for testing the Employee and SalariedEmployee classes
public class que2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating an array of five SalariedEmployee objects
        SalariedEmployee employeeData[] = new SalariedEmployee[5];

        // Taking input for each employee and storing it in the array
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of the Employee " + (i + 1) + ": ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Enter ID of Employee " + (i + 1) + ": ");
            String id = sc.next();
            sc.nextLine();
            System.out.print("Enter Age of Employee " + (i + 1) + ": ");
            int age = sc.nextInt();
            System.out.print("Enter Salary of Employee " + (i + 1) + ": ");
            double empSalary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Is employee " + (i + 1) + " permanent or on contract? Enter '1' if employee is permanent and '0' if employee is on contract. - ");
            int permanentEmp = sc.nextInt();
            sc.nextLine();

            employeeData[i] = new SalariedEmployee(name, id, age, empSalary, permanentEmp);
            System.out.println("");
        }

        // Finding the employee with the highest salary using a loop
        SalariedEmployee highestSalary = employeeData[0];
        for (int i = 0; i < 4; i++) {
            if (employeeData[i + 1].calculateTotalSalary() > highestSalary.calculateTotalSalary()) {
                highestSalary = employeeData[i + 1];
            }
        }
        System.out.println("");

        // Printing details of the employee with the highest salary
        System.out.println("Details of the employee with the highest salary is as follows:");
        System.out.println("Name of Employee: " + highestSalary.getName());
        System.out.println("ID of Employee: " + highestSalary.getID());
        System.out.println("Age of Employee: " + highestSalary.getAge());
        System.out.println("Salary: " + highestSalary.calculateTotalSalary());
        System.out.print("The employee is ");
        if (highestSalary.permanentEmp == 1) {
            System.out.print("permanent.");
        } else {
            System.out.print("on contract.");
        }
    }
}
