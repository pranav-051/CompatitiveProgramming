
class Solution {

    public int myAtoi(String s) {
        // Remove leading and trailing spaces
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int index = 0;
        int sign = 1;
        long result = 0;

        // Check for a sign at the beginning
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Iterate through characters to form the integer
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');

            // Clamp result if it exceeds 32-bit signed integer range
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        return (int) (result * sign);
    }
}

public class string_to_integer_8 {

    public static void main(String[] args) {
        String s = "3.14159";
        Solution sol = new Solution();
        System.out.println("Result:" + sol.myAtoi(s));
    }
}
