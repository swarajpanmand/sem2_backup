package exp4;

import java.util.*;

class Rating {
    public static void avgRating(double bookRating[][], int numBook, int numUser) {
        double[] avgSaves = new double[numBook];
        for (int i = 0; i < numBook; i++) {
            double avg = 0;
            for (int j = 0; j < numUser; j++) {
                avg += bookRating[i][j];
            }
            avgSaves[i] = avg / 2;
            System.out.printf("Average Rating of the Book %d: %.2f\n", (i + 1), avgSaves[i]);
        }
        highAvg(avgSaves);
    }

    public static void highAvg(double avgSave[]) {
        double max = avgSave[0];
        int i = 0;
        int hgh = 0;
        for (i = 0; i < avgSave.length; i++) { // iterating through elements using for loop
            if (max < avgSave[i]) {
                max = avgSave[i];
                hgh = i;
            }
        }
        System.out.println("The book with the highest rating is book " + (hgh + 1) + " with an average value of " + max + ".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int numBooks = sc.nextInt(); // asking the user for the number of books
        System.out.print("Enter the number of Readers: ");
        int numUsers = sc.nextInt(); // asking the user for the number of readers
        double[][] bookRating = new double[numBooks][numUsers];
        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter the ratings for Book " + (i + 1) + ": ");
            for (int j = 0; j < numUsers; j++) {
                System.out.print("Enter the rating from Reader " + (i + 1) + ": ");
                bookRating[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(bookRating));
        avgRating(bookRating, numBooks, numUsers);
    }
}
