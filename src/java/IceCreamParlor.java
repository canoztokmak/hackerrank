package java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// hackerrank - ice cream parlor
public class IceCreamParlor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        for (int i = 0; i < test; i++) {
            int m = in.nextInt();
            int n = in.nextInt();
            Map<Integer, Integer> counts = new TreeMap<Integer, Integer>();
            List<Integer> prices = new ArrayList<Integer>();
            for(int j = 0; j < n; j++) {
                int val = in.nextInt();
                Integer count = counts.get(val);
                if (count == null) {
                    counts.put(val, 1);
                } else {
                    counts.put(val, ++count);
                }
                prices.add(val);
            }

            solve(m, counts, prices);

        }

    }

    private static void solve(int m, Map<Integer, Integer> counts, List<Integer> prices) {

        int found = -1;
        boolean same = false;
        for(Integer key : counts.keySet()) {
            int needed = m - key;
            if (needed == key) {
                if (counts.get(needed) != null && counts.get(key) > 1) {
                    found = key;
                    same = true;
                    break;
                }
            } else {
                if (counts.get(needed) != null && counts.get(needed) > 0) {
                    found = key;
                    break;
                }
            }
        }

        int index1, index2;
        if (same) {
            index1 = prices.indexOf(found);
            prices.set(index1, -1);
            index2 = prices.indexOf(found);
        } else {
            index1 = prices.indexOf(found);
            index2 = prices.indexOf(m - found);
        }

        if (index1 < index2) {
            System.out.println(++index1 + " " + ++index2);
        } else {
            System.out.println(++index2 + " " + ++index1);
        }

    }

}
