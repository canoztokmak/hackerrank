package hackerrank.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// hackerrank - manasa and stones
public class ManasaAndStones {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            int stones = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            findLastStones(stones-1, a, b);
        }

    }

    private static void findLastStones(int gap, int a, int b) {

        int small = a < b ? a : b;
        int big = a < b ? b : a;
        Set<Long> set = new HashSet<Long>();

        for (int i = 0; i <= gap; i++) {
            long val = ((gap-i) * small) + (i * big);
            if (!set.contains(val)) {
                set.add(val);
                System.out.print(val + " ");
            }
        }
        System.out.println();

    }



}
