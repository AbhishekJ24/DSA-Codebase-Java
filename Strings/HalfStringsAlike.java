package Strings;
public class HalfStringsAlike{
    public static boolean halvesAreAlike(String s) {
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length()/2;i++){
            char ch=s.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
            count1++;
        }
        for(int i=s.length()/2;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
            count2++;
        }
        if(count1==count2)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }
}