package java;

import java.util.Scanner;

// hackerrank - restaurant
public class Restaurant {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            int l = in.nextInt();
            int b = in.nextInt();

            int gcd = gcd(l,b);

            System.out.println((l/gcd)*(b/gcd));

        }

    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

}
