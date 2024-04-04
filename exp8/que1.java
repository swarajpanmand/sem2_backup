package exp8;
import java.util.*;

// Interface for calculating volume
interface Volume{
    void getVolume(); // Method to calculate and display volume
}

// Interface for calculating surface area
interface SurfaceArea{
    void getSurfaceArea(); // Method to calculate and display surface area
}

// Class representing a cylinder which implements both Volume and SurfaceArea interfaces
class Cylinder implements Volume, SurfaceArea{
    private int radius; // Radius of the cylinder
    private int height; // Height of the cylinder
    
    // Constructor to initialize the radius and height of the cylinder
    Cylinder(int radius , int height){
        this.radius = radius;
        this.height = height;
    }
    
    // Method to calculate and display the volume of the cylinder
    public void getVolume(){
        System.out.printf("Volume: %.2f", (3.142 * radius * radius * height));
        System.out.println("");
    }
    
    // Method to calculate and display the surface area of the cylinder
    public void getSurfaceArea(){
        System.out.printf("Surface Area: %.2f",(2 * 3.142 * radius * height + 2 * 3.142 * radius * radius));
        System.out.println("");
    }
}

// Test class to create Cylinder object and perform calculations
class TestCylinder{
    public static void main(String[] by){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt(); // Input radius from the user
        System.out.print("Enter the height: ");
        int height = sc.nextInt(); // Input height from the user
        Cylinder cy = new Cylinder(radius, height); // Create Cylinder object
        
        // Prompt user for choice
        System.out.println("1.Volume\n2.Surface Area\n3.Both\nEnter your choice: ");
        int choice = sc.nextInt(); // Input choice from the user
        switch (choice) {
            case 1: // Calculate and display volume
                cy.getVolume();
                break;

            case 2: // Calculate and display surface area
                cy.getSurfaceArea();
                break;

            case 3: // Calculate and display both volume and surface area
                cy.getVolume();
                cy.getSurfaceArea();
                break;

            default:
                break;
        }
    }
}
