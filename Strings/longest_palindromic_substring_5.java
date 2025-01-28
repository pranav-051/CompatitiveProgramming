
class Solution {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Expand around i as the center (odd-length palindrome)
            int len1 = expandAroundCenter(s, i, i);
            // Expand around i and i+1 as the center (even-length palindrome)
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            // Update the start and end pointers if a longer palindrome is found
            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

public class longest_palindromic_substring_5 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aacabdkacaa";
        String r = sol.longestPalindrome(s);
        System.out.println("Result: " + r);
    }
}
