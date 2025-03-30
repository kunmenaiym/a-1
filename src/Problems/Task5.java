package Problems;

import java.util.Scanner;

public class Task5 {

    public static void run () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(fibonacci(n));
    }

    public static int fibonacci (int n) {

        if (n == 1) return 1;
        if (n == 0) return 0;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
