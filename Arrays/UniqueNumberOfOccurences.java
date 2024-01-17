package Arrays;

public class UniqueNumberOfOccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        int freq[] = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            int numb = arr[i];
            if (numb >= 0)
                freq[numb]++;
            else
                freq[Math.abs(numb) + 1000]++;
        }
        for (int i = 0; i < 1999; i++) {
            if (freq[i] != 0) {
                for (int j = i + 1; j < 2000; j++) {
                    if (freq[i] == freq[j])
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int array[] = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
        System.out.println(uniqueOccurrences(array));
    }
}
