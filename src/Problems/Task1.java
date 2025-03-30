package Problems;

import java.util.Scanner;

public class Task1 {


    public static void run(){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(findMin(arr, n));
    }


    public static int findMin(int[] arr, int n) {

        if (n == 1)
            return arr[0];

        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

}
