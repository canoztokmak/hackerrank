package javaexamples.hackerrank;

import java.util.Scanner;

/**
 * Created by oztokmakc on 19/02/15.
 */
// hackerrank - sherlock and squares
public class SherlockAndSquares {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            long a = in.nextLong();
            long b = in.nextLong();

            System.out.println((int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1));

        }

    }

}
