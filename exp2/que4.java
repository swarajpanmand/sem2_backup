package exp2;

class Vehicle {
    int now;
    String make;

    Vehicle() {
        now = 1;
        make = "no vehicle exists";
    }

    Vehicle(int now) {
        this.now = now;
        if (now == 2);
        make = "2wheeler";
    }

    Vehicle(int now, String make) {
        this.now = now;
        this.make = make;
    }

    void display() {
        System.out.println("Number of wheels: " + now);
        System.out.println(make);
    }

    public static void main(String[] args) {
        Vehicle vec1 = new Vehicle();
        vec1.display();
        System.out.println("");
        Vehicle vec2 = new Vehicle(2);
        vec2.display();
        System.out.println("");
        Vehicle vec3 = new Vehicle(4, "fourwheeler");
        vec3.display();
    }
}
