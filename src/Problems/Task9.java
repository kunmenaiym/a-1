package Problems;

import java.util.Scanner;

public class Task9 {

    // This method runs the task
    public static void run(Scanner in) {

        int n = in.nextInt();
        int k = in.nextInt();

        // Measuring execution time and output results
        double startTime = System.nanoTime();
        int result = binomialCoefficient(n, k);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method calculates the binomial coefficient C(n, k) using recursion.
     *
     * The binomial coefficient is defined as:
     * C(n, k) = n! / (k! * (n-k)!)
     * Using Pascal's identity:
     * C(n, k) = C(n-1, k-1) + C(n-1, k)
     *
     * Time complexity: O(2^n) in the worst case, due to overlapping subproblems.
     * This can be optimized using dynamic programming or memoization.
     *
     * @param n The total number of elements.
     * @param k The number of elements to choose.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient (int n, int k) {

        if (k < 0 || n < 0) {
            throw new IllegalArgumentException("Negative binomial coefficient parameters");
        }

        if (k == n || k == 0) {
            return 1;
        }
        return binomialCoefficient(n - 1, k -1) + binomialCoefficient(n - 1, k);
    }
}
