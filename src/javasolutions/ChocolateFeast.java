package javasolutions;

import java.util.Scanner;

// hackerrank - chocolate feast
public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long solve(int N, int C, int M){

        long total = N/C;
        long wrapper = total;

        while (wrapper >= M) {
            long free = wrapper / M;
            wrapper = free + (wrapper % M);
            total += free;
        }

        return total;

    }

}
