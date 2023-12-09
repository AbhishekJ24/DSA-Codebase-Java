package ArrayList;

import java.util.ArrayList;

public class MonotonicCheck {
    public static boolean checkMonotone(ArrayList <Integer> list){
        int checkInc=0, checkDec=0;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<list.get(i+1))
            ++checkInc;
            else
            ++checkDec;
        }
        if(checkInc==list.size()-1 || checkDec==list.size()-1)
        return true;
        else
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        System.out.println(checkMonotone(list));
    }
}
