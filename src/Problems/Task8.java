package Problems;

import java.util.Scanner;

public class Task8 {

    // This method runs the task
    public static void run(Scanner in) {


        String s = in.next();

        // Measuring execution time and output results
        double startTime = System.nanoTime();
        String result = digitCheck(s, 0) ? "Yes" : "No";
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");

    }

    /**
     * This method recursively checks if a string consists only of digits.
     *
     * Time complexity: O(n), where n is the length of the string.
     * The function checks each character once, resulting in linear complexity.
     *
     * @param s      The input string.
     * @param index  The current index being checked.
     * @return       true if the entire string consists only of digits, false otherwise.
     */

    public static boolean digitCheck(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        return digitCheck(s, index + 1);
    }
}
