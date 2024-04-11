import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        List<Character> sortedChars = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(sortedChars, (a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        StringBuilder result = new StringBuilder();
        for (char ch : sortedChars) {
            int frequency = frequencyMap.get(ch);
            for (int i = 0; i < frequency; i++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(frequencySort("hello"));
    }
}
