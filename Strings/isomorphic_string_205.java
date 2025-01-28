
import java.util.HashMap;

class Solution {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            HashMap<Character, Character> map1 = new HashMap<>();
            HashMap<Character, Character> map2 = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);

                if (map1.containsKey(c1)) {
                    if (map1.get(c1) != c2) {
                        return false;
                    }
                } else {
                    map1.put(c1, c2);
                }

                if (map2.containsKey(c2)) {
                    if (map2.get(c2) != c1) {
                        return false;
                    }
                } else {
                    map2.put(c2, c1);
                }
            }
        }
        return true;
    }
}

class isomorphic_string_205 {

    public static void main(String[] args) {
        Solution soln = new Solution();
        String s = "egg";
        String t = "add";

        boolean result = soln.isIsomorphic(s, t);
        System.out.println("Isomorphic: " + result);
    }
}
