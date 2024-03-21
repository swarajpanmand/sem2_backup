package exp7;

//try changing the file name

// Abstract class representing a generic shape
abstract public class que1 {
    protected String color; // Color of the shape
	
	// Default constructor sets color to "Red"
	que1(){
		this.color = "Red";
	}
	
	// Constructor to set color
	que1(String color){
		this.color = color;
	}
	
	// Method to get color of the shape
	String getData(){
		return color;
	}
	
	// Abstract method to calculate area of the shape
	abstract double area();
	
	// Abstract method to display details of the shape
	void display(){
	}
}

// Rectangle class inheriting from Shape
class Rectangle extends que1 {
	private double length, breadth; // Dimensions of the rectangle
	
	// Default constructor sets length and breadth to 1
	Rectangle(){
		length = breadth = 1;
	}
	
	// Constructor to initialize length and breadth
	Rectangle(double length , double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	// Constructor to initialize length, breadth, and color
	Rectangle(double length , double breadth, String color){
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	
	// Getter method for breadth
	public double getBreadth(){
		return breadth;
	}
	
	// Method to calculate area of rectangle
	double area(){
		return length * breadth;
	}
	
	// Method to display details of rectangle
	void display(){
		super.display();
		System.out.println("  Color: " + getData());
		System.out.println("  Length: " + length);
		System.out.println("  Breadth: " + breadth);
	}
}

// Circle class inheriting from Shape
class Circle extends que1 {
    private double radius; // Radius of the circle

	// Default constructor sets radius to 1
	Circle(){
    	radius = 1;
	}

	// Constructor to initialize radius
	Circle(double radius){
    	this.radius = radius;
	}

	// Constructor to initialize radius and color
	Circle(double radius, String color){
    	super(color);
    	this.radius = radius;
	}

	// Method to calculate area of circle
	double area(){
    	return 3.142 * radius * radius;
	}

	// Method to display details of circle
	void display(){
    	super.display();
    	System.out.println("  Color: " + getData());
    	System.out.println("  Radius: " + radius);
	}
}

// Diagram class to represent a collection of shapes
class Diagram {
	
	que1[] shapes; // Array to store shapes
	
	// Constructor to initialize Diagram with an array of shapes
	Diagram(que1[] shapes){
		this.shapes = shapes;
	}
	
	// Method to calculate total area of all shapes in the diagram
	public double totalArea(){
		double total = 0;
		for(que1 shape: shapes){
			total += shape.area();
		}
		return total;
	}
}

// Tester class to test the shape hierarchy
class Tester{
	public static void main(String[] args){
		// Create instances of Rectangle and Circle
		Rectangle rectangle1 = new Rectangle(5, 4, "Red");
    	Rectangle rectangle2 = new Rectangle(3, 6, "Blue");
    	Circle circle1 = new Circle(4, "Green");
    	Circle circle2 = new Circle(3, "Yellow");

		// Create arrays of shapes
		que1[] shape1 = {rectangle1, circle1};
		que1[] shape2 = {rectangle2, circle2};
		
		// Create diagrams with the arrays of shapes
		Diagram diagram1 = new Diagram(shape1);
		Diagram diagram2 = new Diagram(shape2);

		// Display details of each shape
		System.out.println("Details of rectangle1: ");
		rectangle1.display();
		System.out.println("Details of circle1: ");
		circle1.display();
		System.out.println("");
		System.out.println("Details of rectangle2: ");
		rectangle2.display();
		System.out.println("Details of circle2: ");
		circle2.display();
		System.out.println("");

		// Display the total area of each diagram
		System.out.println("Total area of diagram1 is: " + diagram1.totalArea());
		System.out.println("Total area of diagram2 is: " + diagram2.totalArea());
	}
} 
