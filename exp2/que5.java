package exp2;

import java.util.*;

class Event {
    String type;
    String theme;
    String day;

    Event() {
        type = "party";
        theme = "traditional";
        day = "Sunday";
    }

    Event(String type) {
        this.type = type;
        this.theme = "bollywood";
        this.day = "Saturday";
    }

    Event(String type, String theme) {
        this.type = type;
        this.theme = theme;
        this.day = "Friday";
    }

    void display() {
        System.out.println(type + " has a theme " + theme + " on " + day);
        System.out.println("");
        System.out.println("Enter none from the options to exit.\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 1;

        do {
            System.out.println("Choose: \n1. trad\n2. bollywood\n3. western");
            int n = sc.nextInt();

            if (n == 1) {
                Event ev1 = new Event();
                ev1.display();
            } else if (n == 2) {
                Event ev2 = new Event("party");
                ev2.display();
            } else if (n == 3) {
                Event ev3 = new Event("party", "western");
                ev3.display();
            } else {
                System.out.println("Invalid");
                break;
            }
        } while (k < 4);
    }
}
