package Strings;
public class maxscoreaftersplitting{
    public static int maxScore(String s) {
        int c;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<s.length();i++){
            c=0;
            String left=s.substring(0,i);
            String right=s.substring(i,s.length());
            for(int j=0;j<left.length();j++){
                if(left.charAt(j)=='0')
                c++;
            }
            for(int j=0;j<right.length();j++){
                if(right.charAt(j)=='1')
                c++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
    public static void main(String[] args) {
        String s="100011111";
        System.out.println(maxScore(s));
    }
}