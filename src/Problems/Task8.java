package Problems;

import java.util.Scanner;

public class Task8 {
    public static void run() {
        Scanner in = new Scanner(System.in);
        String s = in.next();


        System.out.println(digitCheck(s, 0) ? "Yes" : "No" );
    }

    public static boolean digitCheck(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        return digitCheck(s, index + 1);
    }
}
