package Problems;

import java.util.Scanner;

public class Task2 {

    // Starts the program by reading user input, measuring execution time
    public static void run(Scanner in) {


        // Reading array size
        int n = in.nextInt();
        int[] arr = new int[n];

        // Filling the array
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        // Measuring execution time and output results
        double startTime = System.nanoTime();
        double result = avg(n, arr);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method calculates the average of the elements in the given array.
     * It uses the sum of the array elements divided by the number of elements.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The method sums all elements recursively and then divides the sum by the number of elements.
     *
     * @param n The number of elements in the array.
     * @param arr The array of integers whose average is to be calculated.
     * @return The average of the elements in the array as a double.
     */
    public static double avg(int n, int[] arr){
        return (double) sum(arr, n) / n;
    }


    /**
     * This method calculates the sum of the elements in the array recursively.
     * It adds the last element of the array to the sum of the rest of the elements.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The recursion goes through each element once, resulting in linear time complexity.
     *
     * @param arr The array whose elements are to be summed.
     * @param n The number of elements currently considered in the sum.
     * @return The sum of the elements in the array up to the n-th element.
     */
    public static int sum(int[] arr, int n){
        if (n == 0) return 0;

        return arr[n - 1] + sum(arr, n - 1);
    }



}

