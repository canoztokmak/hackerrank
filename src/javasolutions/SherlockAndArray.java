package javasolutions;

import java.util.Scanner;

// hackerrank - sherlock and array
public class SherlockAndArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for (int i = 0; i < count; i++) {

            int size = in.nextInt();
            int[] arr = new int[size];
            long sum = 0;
            for (int j = 0; j < size; j++) {
                int val = in.nextInt();
                sum += val;
                arr[j] = val;
            }

            boolean found = false;
            long acc = 0;
            for (int j = 0; j < size; j++) {
                if (acc == (sum - acc - arr[j])) {
                    found = true;
                    break;
                }
                acc += arr[j];
            }

            if (found) System.out.println("YES");
            else System.out.println("NO");

        }

    }

}
