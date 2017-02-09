package javasolutions;

import java.util.Scanner;

// hackerrank - counting inversions
public class CountingInversions {

    static long inversionCount;

    static int[] sort(int[] arr) {
        if (arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = new int[mid];
        System.arraycopy(arr, 0, left, 0, mid);

        int[] right = new int[arr.length - mid];
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        return merge(sort(left), sort(right));
    }

    static int[] merge(int[] left, int[] right) {
        int l = 0;
        int r = 0;
        int index = 0;

        int[] merged = new int[left.length + right.length];

        while (l < left.length && r < right.length) {
            if (left[l] > right[r]) {
                inversionCount += left.length - l;
                merged[index++] = right[r++];
            } else {
                merged[index++] = left[l++];
            }
        }

        if (l == left.length) {
            for (int i = r; i < right.length; i++) {
                merged[index++] = right[i];
            }
        } else {
            for (int i = l; i < left.length; i++) {
                merged[index++] = left[i];
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

//            inversionCount = 0;
//
//            bubbleSort(arr);
//            System.out.println(inversionCount);
//
            inversionCount = 0;
            sort(arr);

            System.out.println(inversionCount);
        }
    }

    static void bubbleSort(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = x; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    inversionCount++;
                }
            }
        }
    }
}
