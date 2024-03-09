package exp3;

class Test {
    private double base;
    private int power;
    private int logBase;
    private int argument;

    Test() {
        base = 2;
        power = 2;
        logBase = 2;
        argument = 4;
    }

    double calculate(double base, int power) {
        return Math.pow(base, power);
    }

    double calculate(int logBase, int argument) {
        return Math.log(argument) / Math.log(logBase);
    }

    void display() {
        System.out.println("log of " + argument + " to the base " + logBase + " is " + calculate(logBase, argument));
        System.out.println("the value " + base + " raised to " + power + " is " + calculate(base, power));
    }
}

class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.calculate(2, 4);
        test.calculate(2.0, 4);
        test.display();
    }
}

