package java;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// hackerrank - angry children
public class AngryChildren {

    public static void main(String[] args) throws NumberFormatException, IOException {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] packets = new int[n];

        for(int i = 0; i < n; i ++) {
            packets[i] = in.nextInt();
        }
        Arrays.sort(packets);
        int unfairness = Integer.MAX_VALUE;

        for (int i = 0; i <= packets.length-k; i++) {
            int diff = packets[i+k-1]-packets[i];
            if (diff < unfairness) {
                unfairness = diff;
            }
        }

        System.out.println(unfairness);

    }

}
