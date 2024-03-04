package exp2;

import java.util.*;

class Doctor {
    String name;
    String degree;
    String spdegree;
    String achievement;

    Doctor(String name, String degree, String spdegree, String achievement) {
        this.name = name;
        this.degree = degree;
        this.spdegree = spdegree;
        this.achievement = achievement;
    }

    void display() {
        System.out.println("Doctor, " + name + " with " + degree + " has specialization in " + spdegree +
                " with achievement " + achievement);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the doctor: ");
        String name = sc.next();

        System.out.println("Enter the degree of the doctor: ");
        String degree = sc.next();

        System.out.println("Enter the spdegree of the doctor: ");
        String spdegree = sc.next();

        // Consume the newline character left in the buffer
        sc.nextLine();
        
        System.out.println("Enter the achievement of the doctor: ");
        String achievement = sc.nextLine();

        Doctor doc = new Doctor(name, degree, spdegree, achievement);
        doc.display();
    }
}
