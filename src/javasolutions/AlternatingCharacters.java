package javasolutions;

import java.util.Scanner;

// hackerrank - alternating characters
public class AlternatingCharacters {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println(findDelete(in.next()));
        }

    }

    private static int findDelete(String line) {

        char[] chars = line.toCharArray();

        char c = chars[0];
        int count = 0;

        for (int i = 1; i < chars.length ; i++) {
            if (c == chars[i]) {
                count++;
            }
            c = chars[i];
        }

        return count;
    }

}
