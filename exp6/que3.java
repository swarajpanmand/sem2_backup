import java.util.Scanner;

class Car {
    private int car_no;
    private String producer;

    // Constructor
    public Car(int car_no, String producer) {
        this.car_no = car_no;
        this.producer = producer;
    }

    // Getters and setters
    public int getCar_no() {
        return car_no;
    }

    public void setCar_no(int car_no) {
        this.car_no = car_no;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    // Method to display car details
    void display() {
        // To be overridden by subclasses
    }
}

// Subclass for passenger cars
class PassCar extends Car {
    private String passCarType;
    private boolean sunRoof;

    // Constructor
    public PassCar(int car_no, String producer, String passCarType, boolean sunRoof) {
        super(car_no, producer);
        this.passCarType = passCarType;
        this.sunRoof = sunRoof;
    }

    // Getters and setters
    public String getPassCarType() {
        return passCarType;
    }

    public void setPassCarType(String passCarType) {
        this.passCarType = passCarType;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    // Method to display passenger car details
    void display() {
        System.out.println("Car No: " + getCar_no());
        System.out.println("Producer: " + getProducer());
        System.out.println("Pass Car Type: " + getPassCarType());
        System.out.println("Sun Roof: " + isSunRoof());
    }
}

// Subclass for trucks
class Truck extends Car {
    private int loadCapacity;
    private int numberAxles;

    // Constructor
    public Truck(int car_no, String producer, int loadCapacity, int numberAxles) {
        super(car_no, producer);
        this.loadCapacity = loadCapacity;
        this.numberAxles = numberAxles;
    }

    // Getters and setters
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumberAxles() {
        return numberAxles;
    }

    public void setNumberAxles(int numberAxles) {
        this.numberAxles = numberAxles;
    }

    // Method to display truck details
    void display() {
        System.out.println("Car No: " + getCar_no());
        System.out.println("Producer: " + getProducer());
        System.out.println("Load Capacity: " + getLoadCapacity());
        System.out.println("Number of Axles: " + getNumberAxles());
    }
}

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for car type
        System.out.print("Which type of car you want? (PassCar/Truck): ");
        String type = sc.nextLine();

        // Handling different car types
        if (type.equals("PassCar")) {
            // Input details for passenger car
            System.out.print("Enter Car No: ");
            int car_no = sc.nextInt();
            System.out.print("Enter Producer: ");
            String producer = sc.next();
            System.out.print("Enter Pass Car Type: ");
            String passCarType = sc.next();
            System.out.print("Enter Sun Roof (true/false): ");
            boolean sunRoof = sc.nextBoolean();

            // Create PassCar object and display details
            PassCar p = new PassCar(car_no, producer, passCarType, sunRoof);
            p.display();
        } else if (type.equals("Truck")) {
            // Input details for truck
            System.out.print("Enter Car No: ");
            int car_no = sc.nextInt();
            System.out.print("Enter Producer: ");
            String producer = sc.next();
            System.out.print("Enter Load Capacity: ");
            int loadCapacity = sc.nextInt();
            System.out.print("Enter Number of Axles: ");
            int numberAxles = sc.nextInt();

            // Create Truck object and display details
            Truck t = new Truck(car_no, producer, loadCapacity, numberAxles);
            t.display();
        } else {
            System.out.println("Invalid car type entered.");
        }
    }
}
