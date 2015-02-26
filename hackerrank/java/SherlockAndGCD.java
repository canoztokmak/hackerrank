package hackerrank.java;

import java.util.Scanner;

// hackerrank - sherlock and gcd
public class SherlockAndGCD {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            if (solve(arr)) System.out.println("YES");
            else System.out.println("NO");

        }

    }

    private static boolean solve(int[] arr) {

        if (arr.length < 2) return false;

        int gcd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcd = gcd(gcd, arr[i]);
            if (gcd == 1) return true;
        }

        return gcd < 2;

    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

}
