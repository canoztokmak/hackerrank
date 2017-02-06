package javasolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// hackerrank - euler #59
public class XORDecryption {

    private static boolean isSymbol(char c) {
        return c == ','
                || c == '.'
                || c == '!'
                || c == '?'
                || c == ':'
                || c == ';'
                || c == '\''
                || c == '-'
                || c == '('
                || c == ')'
                ;
    }

    private static char decrypt(List<Integer> list) {

        for (int i = 97; i <= 122; i++) {
            boolean found = false;
            for (Integer item : list) {
                char c = (char)(item ^ i);
                if (Character.isLetterOrDigit(c) || Character.isSpaceChar(c) || isSymbol(c)) {
                    found = true;
                } else {
                    found = false;
                    break;
                }
            }

            if (found) return (char)i;
        }

        return 32;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            switch (i % 3) {
                case 0:
                    list1.add(in.nextInt());
                    break;
                case 1:
                    list2.add(in.nextInt());
                    break;
                case 2:
                    list3.add(in.nextInt());
                    break;
            }
        }

        System.out.print(decrypt(list1));
        System.out.print(decrypt(list2));
        System.out.print(decrypt(list3));

    }

}
