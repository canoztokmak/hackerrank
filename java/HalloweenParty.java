package javaexamples.hackerrank;

import java.util.Scanner;

/**
 * Created by oztokmakc on 19/02/15.
 */
// hackerrank - halloween party
public class HalloweenParty {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            long input = in.nextInt();

            System.out.println((input/2)*(input - (input/2)));

        }

    }

}
