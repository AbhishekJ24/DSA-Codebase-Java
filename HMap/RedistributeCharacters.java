public class RedistributeCharacters {
    public static boolean makeEqual(String[] words) {
        int[] counts = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                counts[c - 'a']++;
            }
        }
        int n = words.length;
        for (int val : counts) {
            if (val % n != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word[] = { "abc", "bc", "aabc" };
        System.out.println(makeEqual(word));
    }
}

// Although the problem can be solved using HashMap, but is solved using integer array for ease and becuase the Map wasn't working in 
// the offline VS Code IDE