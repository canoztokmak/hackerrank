package javaexamples.hackerrank;

import java.util.Scanner;

/**
 * Created by oztokmakc on 19/02/15.
 */
// hackerrank - reverse game
public class ReverseGame {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            if (k >= (n / 2)) {
                System.out.println(2*(n - k - 1));
            } else {
                System.out.println(1 + (2 * k));
            }
        }

    }

}
