package Strings;
public class LargestSubstring{
    public static int maxLengthBetweenEqualCharacters(String s) {
        int l=s.length();
        if(l==2){
            if(s.charAt(0)==s.charAt(1))
            return 0;
            else
            return -1;
        }
        int len=-1;
        for(int i=0;i<l;i++){
            for(int j=l-1;j>=i+1;j--){
                if(s.charAt(j)==s.charAt(i)){
                    String sub=s.substring(i+1,j);
                    len=Math.max(len,sub.length());
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("abcdeaa"));
    }
}