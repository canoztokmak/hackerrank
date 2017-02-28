package javasolutions;

import java.util.Scanner;
import java.util.Stack;

// hackerrank - and xor or
public class AndXorOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        int max = 0;
        for (int i = 1; i < n; i++) {
            while (!stack.empty()) {
                max = Math.max(max, arr[i] ^ stack.peek());

                if (arr[i] < stack.peek()) {
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(arr[i]);
        }

        System.out.println(max);
    }
}
