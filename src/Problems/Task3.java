package Problems;

import java.util.Scanner;

public class Task3 {

    // Starts the program by reading user input, measuring execution time
    public static void run (Scanner in) {


        int n = in.nextInt();

        // Check if the number is prime or composite
        if (isPrime(n, 2)){
            System.out.println("Prime");
        }
        else {
            System.out.println("Composite");
        }

        // Measuring execution time and output results
        double startTime = System.nanoTime();
        boolean result = isPrime(n,  2);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }


    /**
     * This method checks whether the given number is prime using recursion.
     * It checks if the number is divisible by any number starting from 2 up to the square root of the number.
     *
     * Time complexity: O(sqrt(n)), where n is the number being checked for primality.
     * The method checks for divisibility from 2 to the square root of n, which results in a time complexity of O(sqrt(n)).
     *
     * @param n The number to be checked for primality.
     * @param i The current divisor being tested (starts from 2 and increments).
     * @return true if n is prime, false if n is not prime.
     */
    public static boolean isPrime(int n, int i){

        if (n < 2) return false;

        if (i * i > n) return true;

        if (n % i == 0) return false;

        return isPrime(n, i + 1);
    }

}
