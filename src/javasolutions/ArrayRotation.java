package javasolutions;

import java.util.Scanner;

// hackerrank - array rotation
public class ArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] temp = new int[k];

        System.arraycopy(a, 0, temp, 0, k);
        System.arraycopy(a, k, a, 0, n-k);
        System.arraycopy(temp, 0, a, n-k, k);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
