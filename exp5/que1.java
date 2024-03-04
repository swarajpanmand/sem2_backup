// Define the base class Shape
class Shape {
    protected String color;

    // Default constructor with default color "Red"
    Shape() {
        this.color = "Red";
    }

    // Parameterized constructor to set the color
    Shape(String color) {
        this.color = color;
    }

    // Getter method to retrieve color data
    String getData() {
        return color;
    }
}

// Define the Rectangle class which extends Shape
class Rectangle extends Shape {
    private float length, breadth;

    // Default constructor with default dimensions (length = breadth = 1)
    Rectangle() {
        length = breadth = 1;
    }

    // Parameterized constructor to set dimensions
    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Parameterized constructor to set dimensions and color
    Rectangle(float length, float breadth, String color) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    float area() {
        return length * breadth;
    }

    // Method to display information about the rectangle
    void display() {
        System.out.println("Color: " + getData());
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}

// Class to test the Rectangle class
class TestRectangle {
    public static void main(String[] args) {
        // Create an instance of Rectangle with default values
        Rectangle r1 = new Rectangle();
        r1.display();
        System.out.println("Area: " + r1.area());
        System.out.println("");

        // Create an instance of Rectangle with specified dimensions
        Rectangle r2 = new Rectangle(3, 4);
        r2.display();
        System.out.println("Area: " + r2.area());
        System.out.println("");

        // Create an instance of Rectangle with specified dimensions and color
        Rectangle r3 = new Rectangle(5, 6, "Black");
        r3.display();
        System.out.println("Area: " + r3.area());
    }
}
