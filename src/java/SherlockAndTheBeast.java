package java;

import java.util.Scanner;

// hackerrank - sherlock and the beast
public class SherlockAndTheBeast {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {

            int n = in.nextInt();
            int threes = findThrees(n);

            if (threes == -1) {
                System.out.println("-1");
                continue;
            }

            StringBuilder result = new StringBuilder();
            for (int j = 0; j < (n-threes); j++) {
                result.append("5");
            }

            for (int k = 0; k < threes; k++) {
                result.append("3");
            }

            System.out.println(result.toString());

        }
    }

    private static int findThrees(int n) {

        for (int i = 0; i < n; i += 5) {
            if ((n - i) % 3 == 0) {
                return i;
            }
        }

        if (n % 5 == 0) return n;
        else return -1;

    }

}
