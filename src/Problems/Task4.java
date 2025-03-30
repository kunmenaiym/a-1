package Problems;

import java.util.Scanner;

public class Task4 {
    public static void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(factorial(n));
    }

    public static int factorial(int n) {

        if (n == 0 || n == 1) return 1;

        return n * factorial(n - 1);
    }
}
