// Cricketer class represents individual cricketers
class Cricketer {
    private String player_name; // Name of the cricketer
    private int runs_hit; // Total runs scored by the cricketer
    private int innings_count; // Total number of innings played by the cricketer
    private int not_out_count; // Total number of times the cricketer remained not out
    private double batting_avg; // Batting average of the cricketer

    // Constructor to initialize Cricketer object
    public Cricketer(String player_name, int runs_hit, int innings_count, int not_out_count) {
        this.player_name = player_name;
        this.runs_hit = runs_hit;
        this.innings_count = innings_count;
        this.not_out_count = not_out_count;
        this.batting_avg = calculateAvg(); // Calculate batting average
    }

    // Method to calculate batting average
    private double calculateAvg() {
        try {
            return (double) (runs_hit + not_out_count * 50) / innings_count;
        } catch (ArithmeticException e) { // Handle potential division by zero
            System.out.println("Error calculating batting average: " + e.getMessage());
            return 0;
        }
    }

    // Getter method for batting average
    public double get_avg() {
        return batting_avg;
    }

    // Override toString method to provide string representation of Cricketer object
    @Override
    public String toString() {
        return "Cricketer{" +
                "player_name='" + player_name + '\'' +
                ", runs_hit=" + runs_hit +
                ", innings_count=" + innings_count +
                ", not_out_count=" + not_out_count +
                ", batting_avg=" + batting_avg +
                '}';
    }
}

// CricketTeam class represents a team of cricketers
class CricketTeam {
    private ArrayList<Cricketer> cricketers = new ArrayList<>(); // List to store cricketers

    // Method to add cricketer to the team
    public void addCricketer(Cricketer cricketer) {
        cricketers.add(cricketer);
    }

    // Method to display cricketers sorted by batting average
    public void displayCricketersByAvg() {
        try {
            // Sort cricketers by batting average
            Collections.sort(cricketers, Comparator.comparing(Cricketer::get_avg));
            // Calculate team average
            double teamAvg = cricketers.stream().mapToDouble(Cricketer::get_avg).average().orElse(0);
            // If team average is less than 20, throw exception
            if (teamAvg < 20) {
                throw new Exception("The average of the batting average of the entire team is less than 20 runs.");
            }
            // Display cricketers
            for (Cricketer cricketer : cricketers) {
                System.out.println(cricketer);
            }
        } catch (Exception e) { // Catch and handle exceptions
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Main class to run the program
public class que2 {
    public static void main(String[] args) {
        CricketTeam team = new CricketTeam();

        // Adding 11 cricketers to the team
        team.addCricketer(new Cricketer("Player 1", 1000, 10, 2));
        team.addCricketer(new Cricketer("Player 2", 800, 10, 1));
        team.addCricketer(new Cricketer("Player 3", 700, 10, 0));
        team.addCricketer(new Cricketer("Player 4", 600, 10, 1));
        team.addCricketer(new Cricketer("Player 5", 500, 10, 2));
        team.addCricketer(new Cricketer("Player 6", 400, 10, 0));
        team.addCricketer(new Cricketer("Player 7", 300, 10, 1));
        team.addCricketer(new Cricketer("Player 8", 200, 10, 2));
        team.addCricketer(new Cricketer("Player 9", 100, 10, 0));
        team.addCricketer(new Cricketer("Player 10", 50, 10, 1));
        team.addCricketer(new Cricketer("Player 11", 0, 10, 2));

        // Display cricketers by batting average
        team.displayCricketersByAvg();
    }
}
