public class stringcompress {
    public static String compress(char[] chars) {
        StringBuilder st = new StringBuilder("");
        for (int i = 0; i < chars.length; i++) {
            Integer count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            st.append(chars[i]);
            if (count > 1)
                st.append(count.toString());
        }
        return st.toString();
    }

    public static void printArr(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char ch[] = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

        printArr(compress(ch));
    }
}
