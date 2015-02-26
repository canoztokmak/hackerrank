package javaexamples.hackerrank;

import java.util.Scanner;

/**
 * Created by oztokmakc on 19/02/15.
 */
// hackerrank - filling jars
public class FillingJars {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int jars = in.nextInt();
        int samples = in.nextInt();
        long sum = 0;

        for (int i = 0; i < samples; i++) {
            long a = in.nextInt();
            long b = in.nextInt();
            long k = in.nextInt();

            sum += (b - a + 1) * k;

        }

        System.out.println(sum/jars);

    }

}
