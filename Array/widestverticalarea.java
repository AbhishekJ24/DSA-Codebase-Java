package Array;

import java.util.Arrays;

public class widestverticalarea{
    public static int verticalArea(int points[][]){
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int ans = 0;
        for (int i = 1; i < points.length; i++) {
            ans = Math.max(ans, points[i][0] - points[i - 1][0]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int points[][]={{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        System.out.println(verticalArea(points));
    }
}