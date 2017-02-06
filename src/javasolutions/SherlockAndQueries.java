package javasolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// hackerrank - sherlock and queries
public class SherlockAndQueries {

    private static long mod = 1000000007;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        long[] a = fetchArrayLong(br.readLine().split(" "));
        int[] b = fetchArray(br.readLine().split(" "));
        long[] c = fetchArrayLong(br.readLine().split(" "));

        Map<Integer, Long> map = new HashMap<Integer, Long>();
        for (int i = 0; i < m; i++) {
            int key = b[i];
            Long value = map.get(key);
            if (value == null) {
                map.put(key, c[i]);
            } else {
                map.put(key, (c[i] * value % mod));
            }
        }

        for (Integer i : map.keySet()) {
            for (int j = i-1; j < n; j+=i) {
                a[j] = a[j] % mod * map.get(i) % mod;
            }
        }


        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(a[i]);
            builder.append(" ");
        }
        System.out.println(builder.toString());

    }

    private static int[] fetchArray(String[] list){

        final int size = list.length;
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(list[i]);
        }

        return arr;

    }

    private static long[] fetchArrayLong(String[] list){

        final int size = list.length;
        long[] arr = new long[size];

        for(int i = 0; i < size; i++){
            arr[i] = Long.parseLong(list[i]);
        }

        return arr;

    }

}
