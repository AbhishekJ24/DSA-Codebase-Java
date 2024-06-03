package GreedyAlgorithms;

public class AppendCharactersInStringToMakeSubsequence{

    public static int appendCharacters(String s, String t) {
        int a=0;
        int b=0;
        int sl = s.length();
        int tl = t.length();
        while(a<sl && b<tl){
            if(s.charAt(a)==t.charAt(b)){
                b++;
            }
            a++;
        }
        return (tl-b);
    }

    public static void main(String[] args) {
        System.out.println(appendCharacters("cooking","coding"));
    }
}