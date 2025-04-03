package Problems;

import java.util.Scanner;

public class Task1 {

    // Starts the program by reading user input, measuring execution time
    public static void run(Scanner in){

        // Reading array size
        int n = in.nextInt();
        int[] arr = new int[n];

        // Filling the array
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        // Measuring execution time and output results
        double startTime = System.nanoTime();
        int result = findMin(arr, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method finds the minimum element in a given array.
     * It uses a recursive approach.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The recursive algorithm compares each element with the minimum of the remaining elements,
     * resulting in linear time complexity.
     *
     * @param arr The array from which to find the minimum element.
     * @param n The number of elements currently considered.
     * @return The minimum element found in the given portion of the array.
     */

    public static int findMin(int[] arr, int n) {

        // Base case
        if (n == 1)
            return arr[0];

        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

}
