package exp1;

import java.util.*;

class Rectangle {
    void perimeter(int a, int b) {
        int peri = 0;
        peri = 2 * a + 2 * b;
        System.out.println("Perimeter is: " + peri);
    }

    void area(int a, int b) {
        int ar = 1;
        ar = a * b;
        System.out.println("Area is: " + ar);
    }
}



class Find {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int a = sc.nextInt();
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();

        Rectangle rect = new Rectangle();
        rect.perimeter(a, b);
        rect.area(a, b);
    }
}
