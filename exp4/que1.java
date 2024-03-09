package exp4;

import java.util.*;

class GradesStatistics {
    public static double calculateAvg(double grades[]) {
        double sum = 0;
        for (double grade : grades) { // iterating through elements using for loop
            sum += grade;
        }
        return sum / grades.length; // returning average
    }

    public static double calculateMin(double grades[]) {
        double min = grades[0];
        for (double grade : grades) { // iterating through elements using for loop
            if (min < grade) {
                min = grade;
            }
        }
        return min; // returning minimum
    }

    public static double calculateMax(double grades[]) {
        double max = grades[0];
        for (double grade : grades) { // iterating through elements using for loop
            if (max > grade) {
                max = grade;
            }
        }
        return max; // returning maximum
    }

    public static double calculateMedian(double grades[]) {
        Arrays.sort(grades);
        int l = grades.length;
        if (l % 2 != 0)
            return grades[l / 2];
        return (grades[(l - 1) / 2] + grades[l / 2]) / 2;
    }

    public static double calculateStdDev(double grades[]) {
        int ssd = 0;
        for (int i = 0; i < grades.length; i++) {
            ssd += (double) Math.pow((grades[i] - calculateAvg(grades)), 2);
        }
        int variance = ssd / grades.length;
        return (double) Math.sqrt(variance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        // initializing an array of length n
        double grades[] = new double[n];
        // initializing for loop for inputs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(grades));
        System.out.printf("Average is: %.2f\n", calculateAvg(grades));
        System.out.printf("Minimum is: %.2f\n", calculateMin(grades));
        System.out.printf("Maximum is: %.2f\n", calculateMax(grades));
        System.out.printf("Median is: %.2f\n", calculateMedian(grades));
        System.out.printf("Standard Deviation is: %.2f\n", calculateStdDev(grades));
    }
}
