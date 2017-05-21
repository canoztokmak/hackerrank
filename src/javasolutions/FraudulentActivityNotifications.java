package javasolutions;

import java.util.Scanner;

// hackerrank - fraudulent activity notifications
public class FraudulentActivityNotifications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] expenditures = new int[n];
        for (int k = 0; k < n; k++) {
            expenditures[k] = sc.nextInt();
        }

        int[] counts = new int[201];
        for (int i = 0; i < d; i++) {
            counts[expenditures[i]]++;
        }

        int medianPosition = (d % 2 != 0) ? (d / 2) + 1 : d / 2;

        int notificationsCount = 0;
        int backIndex = 0;

        for (int j = d; j < n; j++) {
            double median = findMedian(counts, d, medianPosition);
            int cost = expenditures[j];

            if ((median * 2) <= cost) {
                notificationsCount++;
            }

            counts[expenditures[backIndex++]] -= 1;
            counts[cost] += 1;
        }

        System.out.println(notificationsCount);
    }

    private static double findMedian(int[] counts, int d, int medianPosition) {
        int count = 0, index = 0;

        while (count < medianPosition) {
            count += counts[index];

            index++;
        }

        int median1 = index - 1;

        if (count > medianPosition || d % 2 != 0) {
            return median1;
        }

        int median2 = index;

        while (counts[median2] == 0) {
            median2++;
        }

        return (median1 + median2) / 2d;
    }
}
