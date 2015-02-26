package hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// hackerrank - is fibo
public class IsFibo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        List<Long> fibo = calculate50();

        for (int i = 0; i < count; i++) {
            if (fibo.contains(in.nextLong())) {
                System.out.println("IsFibo");
            } else {
                System.out.println("IsNotFibo");
            }
        }

    }

    private static List<Long> calculate50() {

        List<Long> fibo = new ArrayList<Long>();
        fibo.add(1l);
        fibo.add(1l);

        for (int i = 0; i < 48; i++) {
            fibo.add(fibo.get(i) + fibo.get(i+1));
        }

        return fibo;

    }

}
