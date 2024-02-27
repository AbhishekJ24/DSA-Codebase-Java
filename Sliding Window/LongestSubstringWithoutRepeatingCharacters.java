import java.util.HashMap;
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        return 0;
        int maxLength=0;
        int start=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch) && start<=map.get(ch))
            start=map.get(ch)+1;
            else
            maxLength=Math.max(maxLength,i-start+1);
            map.put(ch,i);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbcda"));
    }
}
