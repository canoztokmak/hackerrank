package javasolutions;

import java.util.*;

// hackerrank - contacts
public class Contacts {
    static final char[] LETTERS = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                             'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private static HashMap<Character, Integer> indexMap;

    private static int getIndex(char c) {
        if (indexMap == null) {
            indexMap = new HashMap<>();
            for (int i = 0; i < LETTERS.length; i++) {
                indexMap.put(LETTERS[i], i);
            }
        }

        return indexMap.get(c);
    }

    static class Node {
        Node[] children;
        int wordCount = 0;

        Node() {
            this.children = new Node[LETTERS.length];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();

        Node trie = new Node();

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < t; j++) {
            String input = in.nextLine();

            String[] parts = input.split(" ");

            String action = parts[0];
            String word = parts[1];

            Node ptr = trie;
            if (action.equalsIgnoreCase("add")) {
                for (int i = 0; i < word.length(); i++) {
                    int index = getIndex(word.charAt(i));
                    if (ptr.children[index] == null) {
                        ptr.children[index] = new Node();
                    }

                    ptr.children[index].wordCount++;

                    ptr = ptr.children[index];
                }
            } else {
                boolean invalidPartial = false;
                for (int i = 0; i < word.length(); i++) {
                    int index = getIndex(word.charAt(i));

                    if (ptr.children[index] == null) {
                        invalidPartial = true;
                        break;
                    } else {
                        ptr = ptr.children[index];
                    }
                }

                if (invalidPartial) {
                    sb.append("0\n");
                } else {
                    sb.append(ptr.wordCount);
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}