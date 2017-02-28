package javasolutions;

import java.util.PriorityQueue;
import java.util.Scanner;

// hackerrank - qheap1
public class QHeap1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            switch(sc.nextInt()) {
                case 1:
                    pq.add(sc.nextInt());
                    break;

                case 2:
                    pq.remove(sc.nextInt());
                    break;

                case 3:
                    System.out.println(pq.peek());
                    break;
            }
        }
    }
}
