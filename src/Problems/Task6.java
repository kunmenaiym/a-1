package Problems;

import java.util.Scanner;

public class Task6 {

    // This method runs the task
    public static void run(Scanner in) {

        int a = in.nextInt();
        int n = in.nextInt();

        // Measuring execution time and output results
        double startTime = System.nanoTime();
        int result = pow(a, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }


    /**
     * This method calculates the power of a number using recursion.
     * It computes a^n, where a is the base and n is the exponent.
     *
     * Time complexity: O(n), where n is the exponent.
     * The method performs n recursive calls, making it linear in complexity.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a raised to the power of n.
     */
    public static int pow(int a, int n) {
        if (n == 0) return 1;

        if (n == 1) return a;

        return a * pow(a, n - 1);
    }
}
