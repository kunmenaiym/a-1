package Problems;

import java.util.Scanner;

public class Task9 {

    public static void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(binomialCoefficient(n, k));
    }

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
