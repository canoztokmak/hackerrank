package javasolutions;

import java.util.*;

// hackerrank -- truck tour
public class TruckTour {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long[] gas = new long[n];
        long[] distance = new long[n];

        for (int i = 0; i < n; i++) {
            gas[i] = in.nextLong();
            distance[i] = in.nextLong();
        }

        long totalGas = 0;
        long minValue = Long.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < n; i++) {
            totalGas += gas[i] - distance[i];
            if (totalGas < minValue) {
                minValue = totalGas;
                minIndex = i+1;
            }
        }

        System.out.println(minIndex);
    }
}
