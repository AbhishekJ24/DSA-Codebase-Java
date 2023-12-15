package ArrayList;

import java.util.*;

public class DestinationCity {
    public static boolean checkIndex(List<List<String>> paths, String s) {
        int c = 0;
        for (int i = 0; i < paths.size(); i++) {
            if (paths.get(i).get(0).equals(s))
                c++;
        }
        if (c == 0)
            return true;
        else
            return false;

    }

    public static String destCity(List<List<String>> paths) {
        String s = "";
        for (int i = 0; i < paths.size(); i++) {
            if (checkIndex(paths, paths.get(i).get(1))) {
                s = paths.get(i).get(1);
                break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        ArrayList<String> aux1 = new ArrayList<>();
        ArrayList<String> aux2 = new ArrayList<>();
        ArrayList<String> aux3 = new ArrayList<>();
        aux1.add("London");
        aux1.add("New York");
        paths.add(aux1);
        aux2.add("New York");
        aux2.add("Lima");
        paths.add(aux2);
        aux3.add("Lima");
        aux3.add("Sao Paulo");
        paths.add(aux3);
        System.out.println(destCity(paths));

    }
}