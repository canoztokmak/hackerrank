package hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// hackerrank - cut the sticks
public class CutTheSticks {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            int val = in.nextInt();
            if (val < min) {
                min = val;
            }
            list.add(val);
        }

        while(size > 0) {
            long cutCount = 0;
            int newMin = Integer.MAX_VALUE;
            List<Integer> tempList = new ArrayList<Integer>();
            for(Integer i : list) {
                int item = i - min;
                cutCount++;
                if (item != 0 && item < newMin) {
                    newMin = item;
                }
                if (item != 0) {
                    tempList.add(item);
                }
            }
            min = newMin;
            list = new ArrayList<Integer>(tempList.size());
            list.addAll(tempList);
            size = list.size();
            System.out.println(cutCount);
        }

    }

}
