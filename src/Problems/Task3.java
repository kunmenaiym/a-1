package Problems;

import java.util.Scanner;

public class Task3 {

    public static void run (){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (isPrime(n, 2)){
            System.out.println("Prime");
        }
        else {
            System.out.println("Composite");
        }
    }

    public static boolean isPrime(int n, int i){

        if (n < 2) return false;

        if (i * i > n) return true;

        if (n % i == 0) return false;

        return isPrime(n, i + 1);
    }

}
