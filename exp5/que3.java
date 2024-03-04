import java.util.*;

// Base class representing a Product
class Product {
    int barcode;
    String name;

    // Parameterized constructor to initialize Product data
    Product(String name, int barcode) {
        this.barcode = barcode;
        this.name = name;
    }

    // Getter method to retrieve barcode
    int getBarcode() {
        return barcode;
    }

    // Getter method to retrieve name
    String getName() {
        return name;
    }
}

// Derived class representing Prepacked Food, inheriting from Product
class Prepacked extends Product {
    int price;

    // Parameterized constructor to initialize Prepacked Food data and call the base class constructor
    Prepacked(String name, int barcode, int price) {
        super(name, barcode);
        this.price = price;
    }

    // Method to display details of Prepacked Food
    public void display() {
        System.out.println("");
        System.out.println("DETAILS FOR PREPACKED FOOD: ");
        System.out.println("Name: " + name);
        System.out.println("Barcode: " + barcode);
        System.out.println("Price: " + price);
    }
}

// Derived class representing Fresh Food, inheriting from Product
class FreshFood extends Product {
    int weight;
    int pricePerKilo;

    // Parameterized constructor to initialize Fresh Food data and call the base class constructor
    FreshFood(String name, int barcode, int weight, int pricePerKilo) {
        super(name, barcode);
        this.weight = weight;
        this.pricePerKilo = pricePerKilo;
    }

    // Method to display details of Fresh Food
    public void display2() {
        System.out.println("");
        System.out.println("DETAILS FOR FRESH FOOD: ");
        System.out.println("Name: " + name);
        System.out.println("Barcode: " + barcode);
        System.out.println("Weight: " + weight);
        System.out.println("Price per kilo: " + pricePerKilo);
    }
}

// Main class for testing Prepacked and FreshFood classes
class Test2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input details for Prepacked Food
        System.out.println("ENTER THE DETAILS FOR PREPACKED FOOD:");
        System.out.print("Enter the name of Prepacked Food: ");
        String name = sc.next();
        System.out.print("Enter the barcode of Prepacked Food: ");
        int barcode = sc.nextInt();
        System.out.print("Enter the Price of Prepacked Food: ");
        int price = sc.nextInt();
        Prepacked pre = new Prepacked(name, barcode, price);

        System.out.println("");

        // Input details for Fresh Food
        System.out.println("ENTER THE DETAILS FOR FRESH FOOD:");
        System.out.print("Enter the name of Fresh Food: ");
        String name1 = sc.next();
        System.out.print("Enter the barcode of Fresh Food: ");
        int barcode1 = sc.nextInt();
        System.out.print("Enter the weight of Fresh Food: ");
        int weight = sc.nextInt();
        System.out.print("Enter the price per kilo of Fresh Food: ");
        int pricePerKilo = sc.nextInt();
        FreshFood fresh = new FreshFood(name, barcode1, weight, pricePerKilo);

        // Display details of both Prepacked and Fresh Food
        pre.display();
        fresh.display2();
    }
}
