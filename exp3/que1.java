class Date {
    private int year, date, hrs, min, sec;
    private int month;

    void setDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    void setDate(int year, int month, int date, int hrs, int min) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
    }

    void setDate(int year, int month, int date, int hrs, int min, int sec) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    void display() {
        System.out.println(date + "/" + month + "/" + year + " Time: " + hrs + ":" + min + ":" + sec);
    }

    Date() {
        year = 2000;
        month = 1;
        date = 01;
        hrs = 00;
        min = 00;
        sec = 00;
    }

    public static void main(String[] args) {
        Date d1 = new Date();
        d1.display();
        d1.setDate(2005, 3, 31);
        d1.display();
        d1.setDate(2004, 4, 30, 4, 40);
        d1.display();
        d1.setDate(2003, 5, 21, 6, 20, 32);
        d1.display();
    }
}
*/
/* /* 
package exp3;
import java.util.Scanner;
public class que1 {
    int id;
    int age;
    int salary;
    String name;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter ur name: ");
    String name = sc.next();
    System.out.println("Enter ur age: ");
    int age = sc.nextInt();
    System.out.println("Enter ur id  ");
    int id = sc.nextInt();
    System.out.println("Enter ur salary:");
    int salary = sc.nextInt();
    que1 q1= new que1(name, age, id, salary);
    q1.getdisplay();
}
que1(String name, int age, int id, int salary){
this.id = id;
this.name = name;
this.age = age;
this.salary = salary;
}
void getdisplay(){
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Id: "+id);
System.out.println("Salary: "+salary);
}
}


