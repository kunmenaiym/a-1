package Problems;

import java.util.Scanner;

public class Task7 {

    // This method runs the task
    public static void run(Scanner in) {


        int n = in.nextInt();

        // Measuring execution time
        double startTime = System.nanoTime();
        reverse(n, in);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(" ");
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method reads n numbers recursively and prints them in reverse order.
     *
     * Time complexity: O(n), where n is the number of elements.
     * The method performs n recursive calls before printing the numbers, resulting in linear complexity.
     *
     * @param n   The number of elements left to read.
     * @param in  The Scanner object for reading input.
     */
    public static void reverse(int  n, Scanner in) {
        if (n == 0) return;

        int num = in.nextInt();
        reverse(n - 1, in);
        System.out.print(num + " ");
    }
}
