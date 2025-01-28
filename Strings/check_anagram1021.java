class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }else {
            int length = s.length();
            String c = "";

            for (int i = 0; i < length; i++) {
                System.out.println("first: "+s);
                char c1 = s.charAt(i);
                c = c + c1;
                if (!t.contains(c)) {
                    return false;
                } else {
                    t = t.replaceFirst(c, " ");
                }
                c = "";
                System.out.println("last: "+t);
            }
        }
        return true;
    }
}

public class check_anagram1021 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram"; 
        Solution S = new Solution();
        boolean a = S.isAnagram(s, t);
        System.out.println("Ans: "+a);
    }    
}
