package javasolutions;

import java.util.HashMap;
import java.util.Scanner;

// hackerrank - no prefix set
public class NoPrefixSet {
    static final char[] LETTERS = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

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
        boolean wordEnd = false;

        Node() {
            this.children = new Node[LETTERS.length];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Node trie = new Node();

        for (int i = 0; i < n; i++) {
            Node ptr = trie;
            String word = scanner.nextLine();

            for (int j = 0; j < word.length(); j++) {
                int index = getIndex(word.charAt(j));
                if (ptr.children[index] == null) {
                    ptr.children[index] = new Node();
                } else {
                    if (ptr.children[index].wordEnd) {
                        System.out.println("BAD SET");
                        System.out.println(word);
                        return;
                    }

                    if (j == word.length()-1) {
                        for (Node child : ptr.children[index].children) {
                            if (child != null) {
                                System.out.println("BAD SET");
                                System.out.println(word);
                                return;
                            }
                        }
                    }
                }

                if (j == word.length()-1) {
                    ptr.children[index].wordEnd = true;
                }

                ptr = ptr.children[index];
            }
        }

        System.out.println("GOOD SET");
    }
}
