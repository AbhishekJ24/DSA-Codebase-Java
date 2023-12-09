package ArrayList;

import java.util.*;

public class PairSum {

    // Pair Sum - 1 for checking if a pair sums to some target in a sorted array.
    public static boolean checkPairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            if ((list.get(lp) + list.get(rp)) == target)
                return true;
            if ((list.get(lp) + list.get(rp)) < target)
                lp++;
            else
                rp--;
        }
        return false;
    }

    // Pair Sum - 2 for checking if a pair sums to some target in a sorted and
    // rotated array at some breaking point.
    public static boolean checkPairSum2(ArrayList<Integer> list, int target) {
        int lp, rp, i;
        int list_size = list.size();
        for (i = 0; i < list_size; i++) {
            if (list.get(i) > list.get(i + 1))
                break;
        }
        lp = i + 1;
        rp = i;
        while (lp < rp) {
            if ((list.get(lp) + list.get(rp)) == target)
                return true;
            if ((list.get(lp) + list.get(rp)) < target)
                lp = (lp + 1) % list_size;
            else
                rp = (list_size + rp - 1) % list_size;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println(checkPairSum1(list1, 20));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(checkPairSum1(list2, 9));

    }
}
