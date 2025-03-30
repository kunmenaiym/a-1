package Problems;

import java.util.Scanner;

public class Task10 {
    public static void run() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
