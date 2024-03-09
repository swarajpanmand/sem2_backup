package exp3;

class Line {
    private int slope, yintercept, x1, y1, y2, x2;

    Line(int slope, int yintercept) {
        this.slope = slope;
        this.yintercept = yintercept;
        display(1);
    }

    Line(int slope, int x1, int y1) {
        this.slope = slope;
        this.x1 = x1;
        this.y1 = y1;
        display(2);
    }

    Line(int slope, int x1, int x2, int y1, int y2) {
        this.slope = slope;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        display(3);
    }

    void display(int n) {
        if (n == 1) {
            System.out.println("Slope y-intercept form: " + "y = " + slope + "x" + " + " + yintercept);
        } else if (n == 2) {
            System.out.println("Slope point form: " + "y - " + y1 + " = " + slope + "(x - " + x1 + ")");
        } else if (n == 3) {
            System.out.println("Two Point form: " + "(y - " + y1 + ") / (" + y2 + " - " + y1 + ") = " +
                    "(x - " + x1 + ") / (" + x1 + " - " + x2 + ")");
        } else {
            System.out.println("ERROR");
        }
    }

    public static void main(String[] args) {
        Line line1 = new Line(3, 5);
        Line line2 = new Line(3, 5, 4);
        Line line3 = new Line(3, 2, 3, 4, 5);
    }
}
