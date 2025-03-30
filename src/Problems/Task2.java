package Problems;

import java.util.Scanner;

public class Task2 {

    public static void run(){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(avg(n, arr));
    }

    public static double avg(int n, int[] arr){
        return (double) sum(arr, n) / n;
    }

    public static int sum(int[] arr, int n){
        if (n == 0) return 0;

        return arr[n - 1] + sum(arr, n - 1);
    }



}

