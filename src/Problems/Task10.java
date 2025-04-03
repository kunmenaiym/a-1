package Problems;

import java.util.Scanner;

public class Task10 {

    // This method runs the task
    public static void run(Scanner in) {

        int a = in.nextInt();
        int b = in.nextInt();

        // Measuring execution time and output results
        double startTime = System.nanoTime();
        int result = gcd(a, b);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method calculates the greatest common divisor (GCD) of two numbers using
     * the Euclidean algorithm.
     *
     * Time complexity: O(log(min(a, b))), which is the number of divisions required
     * to reduce the smaller number to zero.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The greatest common divisor (GCD) of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
