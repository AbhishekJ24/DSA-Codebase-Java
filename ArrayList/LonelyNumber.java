package ArrayList;

import java.util.ArrayList;

public class LonelyNumber {

    public static boolean checkOccurence(ArrayList <Integer> li, int n){
        li.remove(n);
        if(li.contains(n))
        return false;
        return true;
    }

    public static void checkLonely(ArrayList<Integer> list) {
        int l=list.size();
        for(int i=0;i<l;i++){
            if(checkOccurence(list, list.get(i))){
                if(i==0){
                if(!(list.contains(list.get(i)+1)))
                System.out.println(list.get(i));
            }
            else if(i==l-1){
                if(!(list.contains(list.get(i)-1)))
                System.out.println(list.get(i));
            }
            else{
                if(!(list.contains(list.get(i)+1) && list.contains(list.get(i)-1)))
                System.out.println(list.get(i));
            }
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        checkLonely(list);
    }
}
