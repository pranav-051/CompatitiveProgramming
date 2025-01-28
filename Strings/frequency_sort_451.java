
import java.util.*;

class Solution {

    public int max(int i, int j) {
        if (i > j)
            return i;
        return j; 
    }

    public String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        int length = s.length();
        TreeMap<Character, Integer> map = new TreeMap<>();

        int hash[] = new int[123];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = 0;
        }

        for (int j = 0; j < length; j++) {
            hash[s.charAt(j)] += 1;
        }

        for (int o = 0; o < hash.length; o++) {
            int value = o;
            if (hash[o] != 0) {
                char c = (char) value;
                map.put(c, hash[o]);
                System.out.println("count: " + hash[o] + "char: " + c);
            }
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the entries by value in descending order
        Collections.sort(entryList, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // LinkedHashMap to preserve the sorted order
        LinkedHashMap<Character, Integer> sortedByValues = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sortedByValues.put(entry.getKey(), entry.getValue());
        }

        // Iterate and build the result
        sortedByValues.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);

            for (int i = 0; i < value; i++) {
                result.append(key); // Append the key `value` times
            }
        });

        return result.toString();
    }
}

public class frequency_sort_451 {

    public static void main(String[] args) {
        String s = "Aabb";
        Solution sol = new Solution();
        System.out.println("Result: " + sol.frequencySort(s));
    }
}
