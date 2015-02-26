package hackerrank.java;

import java.util.Scanner;

// hackerrank - love letter mystery
public class LoveLetterMystery {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println(reduceCount(in.next()));
        }

    }

    private static int reduceCount(String line) {

        int val = 0;
        int length = line.length();
        char[] chars = line.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            if(chars[i] > chars[length-1 - i]) {
                val += (chars[i] - chars[length-1 - i]);
            } else {
                val += (chars[length-1 - i] - chars[i]);
            }
        }

        return val;

    }

}
