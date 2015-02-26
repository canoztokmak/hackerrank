package javaexamples.hackerrank;

import java.util.Scanner;

/**
 * Created by oztokmakc on 19/02/15.
 */
// hackerrank - find digits
public class FindDigits {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        long numbers[] = new long[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextLong();
        }

        for (long l : numbers) {
            System.out.println(calcValidDigits(toDigits(l), l));
        }

    }

    private static int[] toDigits(long val) {

        char[] arr = String.valueOf(val).toCharArray();
        int[] retVal = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            retVal[i] = Integer.parseInt("" + arr[i]);
        }

        return retVal;

    }

    private static int calcValidDigits(int[] digits, long number) {

        int count = 0;
        for (int i : digits) {
            if (i == 0) continue;
            if (number % i == 0) {
                count++;
            }
        }

        return count;

    }

}
