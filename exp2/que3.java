package exp2;

import java.util.*;

class Hospital {
    int id;
    String name;
    String disease;

    void setPat(String pname, int pid, String pdisease) {
        id = pid;
        name = pname;
        disease = pdisease;
    }

    void setName(String pname) {
        name = pname;
    }

    String getName() {
        return name;
    }

    void setId(int pid) {
        id = pid;
    }

    int getId() {
        return id;
    }

    void setDis(String pdisease) {
        disease = pdisease;
    }

    String getDis() {
        return disease;
    }

    void display() {
        System.out.println("Name of the patient is " + getName() + " with an id: " + getId() + " has a disease " + getDis());
    }

    Hospital() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital pat = new Hospital();

        System.out.println("Enter the name of the patient: ");
        String pname = sc.next();
        pat.setName(pname);
        pat.getName();

        System.out.println("Enter the id of the patient: ");
        int pid = sc.nextInt();
        pat.setId(pid);
        pat.getId();

        System.out.println("Enter the disease of the patient: ");
        String pdisease = sc.next();
        pat.setDis(pdisease);
        pat.getDis();
        pat.display();
    }
}
