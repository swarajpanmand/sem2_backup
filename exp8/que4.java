//try compiling by javac que4.java

package exp8;


import java.util.Arrays;

// Interface representing a sortable object
interface Sortable {
    void sort(int[] arr); // Method to sort an array
}

// Class implementing bubble sort algorithm
class BubbleSort implements Sortable {

    // Method to sort an array using bubble sort algorithm
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}

// Class implementing selection sort algorithm
class SelectionSort implements Sortable {
    // Method to sort an array using selection sort algorithm
    public void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}

// Test class to demonstrate sorting
class que4 {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; // Input array
        System.out.println(Arrays.toString(arr)); // Print original array

        BubbleSort b = new BubbleSort(); // Create BubbleSort object
        SelectionSort s = new SelectionSort(); // Create SelectionSort object

        b.sort(arr); // Sort array using BubbleSort
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(arr)); // Print sorted array

        s.sort(arr); // Sort array using SelectionSort
        System.out.println("Sorted array using Selection Sort: " + Arrays.toString(arr)); // Print sorted array
    }
}
