package exp2;

import java.util.*;

class Time {
    int hr;
    int min;
    int sec;

    Time(int seconds) {
        this.hr = seconds / 3600;
        this.min = (seconds % 3600) / 60;
        this.sec = seconds % 60;
    }

    void display() {
        System.out.println("Hour: " + hr + " Minute: " + min + " Seconds: " + sec);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seconds: ");
        int seconds = sc.nextInt();

        Time time = new Time(seconds);
        time.display();
    }
}
