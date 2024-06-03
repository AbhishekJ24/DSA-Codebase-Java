public class Subsets_Backtracking {
    public static void findSubsets(String str, int i, String ans) {
        if (i == str.length()) {
            if (ans.length() == 0)
                System.out.println("null");
            else
                System.out.println(ans);
            return;
        }
        findSubsets(str, i + 1, ans + str.charAt(i));
        findSubsets(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "xyz";
        findSubsets(str, 0, "");
    }

}