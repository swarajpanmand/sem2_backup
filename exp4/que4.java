package exp4;

import java.util.*;

class Movie {
    String name;
    String type;
    String hero;
    String heroine;
    double budget;

    public Movie(String name, String type, String hero, String heroine, double budget) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
        this.budget = budget;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of movies: ");
        int num = sc.nextInt();
        Movie[] movies = new Movie[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the name of the movie" + (i + 1) + ": ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Enter the type of the movie" + (i + 1) + ": ");
            String type = sc.next();
            sc.nextLine();
            System.out.print("Enter the hero of the movie" + (i + 1) + ": ");
            String hero = sc.next();
            sc.nextLine();
            System.out.print("Enter the heroine of the movie" + (i + 1) + ": ");
            String heroine = sc.next();
            sc.nextLine();
            System.out.print("Enter the budget of the movie" + (i + 1) + ": ");
            double budget = sc.nextDouble();
            sc.nextLine();
            movies[i] = new Movie(name, type, hero, heroine, budget);
            System.out.println("\n");
        }

        // bubble sort
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (movies[j].budget > movies[j + 1].budget) {
                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                }
            }
        }

        System.out.println("Movies sorted by budget:");
        System.out.println("__________________________________________________");

        for (Movie movie : movies) {
            System.out.println("");
            System.out.println("Movie name: " + movie.name);
            System.out.println("Movie type: " + movie.type);
            System.out.println("Movie hero: " + movie.hero);
            System.out.println("Movie heroine: " + movie.heroine);
            System.out.println("Movie budget: " + movie.budget);
            System.out.println("__________________________________________________");
        }
    }
}
