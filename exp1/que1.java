package exp1;

import java.util.*;

class Calculator {
    void mul(int a, int b) {
        int mul = 1;
        mul = a * b;
        System.out.println("Multiplication is: " + mul);
    }

    void sub(int a, int b) {
        int sub = 0;
        if (a > b) {
            sub = a - b;
        } else {
            sub = b - a;
        }
        System.out.println("Subtraction is: " + sub);
    }

    void div(float a, float b) {
        float div = 1;
        div = a / b;
        System.out.println("Division is: " + div);
    }

    void add(int a, int b) {
        int add = 0;
        add = a + b;
        System.out.println("Addition is: " + add);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("Choose from the below\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n");
        n = sc.nextInt();

        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        Calculator cal = new Calculator();

        switch (n) {
            case 1:
                cal.add(a, b);
                break;
            case 2:
                cal.sub(a, b);
                break;
            case 3:
                cal.mul(a, b);
                break;
            case 4:
                cal.div(a, b);
                break;
            default:
                System.out.println("Error");
        }
    }
}
