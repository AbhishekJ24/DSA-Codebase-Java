public class Permutations_Backtracking {
    public static void perm(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            perm(newStr, ans + current);
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        perm(str, "");
    }
}
