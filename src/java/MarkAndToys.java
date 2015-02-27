package java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// hackerrank - mark and toys
public class MarkAndToys {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), k = in.nextInt();

        List<Integer> prices = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            int price = in.nextInt();
            if (price <= k) {
                prices.add(price);
            }
        }

        int answer = 0;

        Collections.sort(prices);
        int left = k;
        for (Integer i : prices) {
            if (i <= left) {
                answer++;
                left -= i;
            }
            if (left < 0) break;
        }
        System.out.println(answer);

    }

}
