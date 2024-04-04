import java.util.*;

// Interface representing eating the order at the restaurant
interface EatItHere{
    double dispatchOrder(); // Method to calculate total bill for eating at the restaurant
}

// Interface representing taking away the order
interface TakeAway{
    double deliverOrder(); // Method to calculate total bill for taking away the order
}

// Class representing the consumer which implements both EatItHere and TakeAway interfaces
class Consumer implements EatItHere, TakeAway{
    int orderNumber; // Order number
    double orderPrice; // Order price
    
    // Constructor to initialize orderNumber and orderPrice
    Consumer(int orderNumber, double orderPrice){
        this.orderNumber = orderNumber;
        this.orderPrice = orderPrice;
    }
    
    // Method to calculate total bill for taking away the order
    public double deliverOrder(){
        double percent5 = 0.05 * orderPrice;
        if(45 > percent5){
            orderPrice = orderPrice + 45;
        }
        else{
            orderPrice = orderPrice + percent5;
        }
        return orderPrice;
    }
    
    // Method to calculate total bill for eating at the restaurant
    public double dispatchOrder(){
        double percent10 = 0.1 * orderPrice;
        if(500 > percent10){
            orderPrice = orderPrice + percent10;
        }
        else{
            orderPrice = orderPrice + 500;
        }
        return orderPrice;
    }
}

// Test class to create Consumer object and perform order processing
class TestConsumer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int rand_int1 = rand.nextInt(20); // Generate random order number
        int rand_int2 = rand.nextInt(2000); // Generate random order price
        System.out.println("Your order number is: " + rand_int1);
        System.out.println("Your order price is: " + rand_int2);
        
        Consumer cos = new Consumer(rand_int1, rand_int2); // Create Consumer object
        
        // Prompt user for choice
        System.out.print("Eat or take (1 for eat, 2 for take): ");
        int eatTake = sc.nextInt(); // Input choice from the user
        if(eatTake == 1){ // Process for eating at the restaurant
            System.out.println("Order " + rand_int1 + " has a total bill of Rs." + cos.deliverOrder());
        }
        else if(eatTake == 2){ // Process for taking away the order
            System.out.println("Order " + rand_int1 + " has a total bill of Rs." + cos.dispatchOrder());
        }
        else{
            System.out.println("Invalid choice."); // Display error message for invalid choice
        }
    }
}
