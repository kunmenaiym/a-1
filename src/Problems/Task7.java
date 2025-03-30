package Problems;

import java.util.Scanner;

public class Task7 {

    public static void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        reverse(n, in);


    }
    public static void reverse(int  n, Scanner in) {
        if (n == 0) return;

        int num = in.nextInt();
        reverse(n - 1, in);
        System.out.print(num + " ");
        System.out.println(" ");
    }
}
