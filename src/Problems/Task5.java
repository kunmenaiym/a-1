package Problems;

import java.util.Scanner;

public class Task5 {

    // This method runs the task
    public static void run (Scanner in) {


        int n = in.nextInt();

        // Measuring execution time and output results
        double startTime = System.nanoTime();
        int result = fibonacci(n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");    }


    /**
     * This method calculates the nth Fibonacci number using recursion.
     * The Fibonacci sequence is defined as:
     *   F(0) = 0
     *   F(1) = 1
     *   F(n) = F(n-1) + F(n-2) for n ≥ 2
     *
     * Time complexity: O(2^n), where n is the position in the Fibonacci sequence.
     * The naive recursive approach leads to exponential growth in calls due to repeated calculations.
     *
     * @param n The position of the Fibonacci number to compute.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci (int n) {

        if (n == 1) return 1;
        if (n == 0) return 0;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
