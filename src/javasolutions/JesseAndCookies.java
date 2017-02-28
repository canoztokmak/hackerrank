package javasolutions;

import java.util.PriorityQueue;
import java.util.Scanner;

// hackerrank - jesse and cookies
public class JesseAndCookies {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        int count = 0;
        while (true) {
            int least = pq.poll();
            if (least >= k) break;

            if (pq.size() == 0) {
                count = -1;
                break;
            }

            int secondLeast = pq.poll();

            int newCookie = least + 2 * secondLeast;

            pq.add(newCookie);
            count++;
        }

        System.out.println(count);
    }
}
