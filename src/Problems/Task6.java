package Problems;

import java.util.Scanner;

public class Task6 {

    public static void run() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();

        System.out.println(pow(a, n));
    }

    public static int pow(int n, int a) {
        if (n == 0) return 1;

        if (n == 1) return a;

        return a * pow(a, n - 1);
    }
}
