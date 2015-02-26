package javaexamples.hackerrank;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by oztokmakc on 18/02/15.
 */
//hackerrank - PRNG sequence guessing
public class PRNGSequenceGuessing {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int j = 0; j < t; j++) {

            solveCase(in);

        }

    }

    private static void printResults(long seed, final Random r) {

        StringBuilder sb = new StringBuilder();
        sb.append(seed);
        sb.append(" ");

        for (int i = 0; i < 10; i++) {
            sb.append(r.nextInt(1000));
            sb.append(" ");
        }

        System.out.println(sb.toString());

    }

    private static void solveCase(Scanner in) {

        long seed1 = in.nextLong(), seed2 = in.nextLong();
        int[] randoms = new int[10];

        for (int i = 0; i < 10; i++) {
            randoms[i] = in.nextInt();
        }

        for (long l = seed1; l <= seed2; l++) {
            Random r = new Random(l);
            boolean seedFound = true;
            for (int i = 0; i < 10; i++) {
                if (r.nextInt(1000) != randoms[i]) {
                    seedFound = false;
                    break;
                }
            }

            if (seedFound) {
                printResults(l, r);
                break;
            }

        }

    }

}
