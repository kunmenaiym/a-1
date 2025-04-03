package Problems;

import java.util.Scanner;

public class Task4 {

    // Starts the program by reading user input, measuring execution time
    public static void run(Scanner in) {

        int n = in.nextInt();


        // Measuring execution time and output results
        double startTime = System.nanoTime();
        int result = factorial(n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method calculates the factorial of a given number using recursion.
     * The factorial of a number n is the product of all positive integers less than or equal to n.
     * Specifically, factorial(n) = n * (n - 1) * (n - 2) * ... * 1.
     *
     * Time complexity: O(n), where n is the number for which the factorial is calculated.
     * The method performs a recursive call for each number from n to 1, resulting in linear time complexity.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the number n.
     */
    public static int factorial(int n) {

        if (n == 0 || n == 1) return 1;

        return n * factorial(n - 1);
    }
}
