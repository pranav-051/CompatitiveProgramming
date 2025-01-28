
mport java.util.*; 
class Solution {

    public int romanToInt(String s) {
        int result = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        if (s.length() == 1) {
            System.out.println("sss");
            return result = hm.get(s.charAt(0));
        }

        for (int i = 1; i < s.length(); i++) {
            char c0 = s.charAt(i - 1);
            char c1 = s.charAt(i);
                    
            if (c0 == 'I' && c1 == 'V') {
                int second = hm.get(c1);
                int first = hm.get(c0);
                result = result + (second - first);
                System.out.println("condn 1: " + result);
                i++;

            } else if (c0 == 'I' && c1 == 'X') {
                int second = hm.get(c1);
                int first = hm.get(c0);
                result = result + (second - first);
                i++;

            } else if (c0 == 'X' && c1 == 'L') {
                int second = hm.get(c1);
                int first = hm.get(c0);
                result = result + (second - first);
                System.out.println("condn 3: " + result);
                i++;

            } else if (c0 == 'X' && c1 == 'C') {
                int second = hm.get(c1);
                int first = hm.get(c0);
                result = result + (second - first);
                System.out.println("condn 4: " + result);
                i++;

            } else if (c0 == 'C' && c1 == 'D') {
                int second = hm.get(c1);
                int first = hm.get(c0);
                result = result + (second - first);
                System.out.println("condn 5: " + result);
                i++;

            } else if (c0 == 'C' && c1 == 'M') {
                int second = hm.get(c1);
                int first = hm.get(c0);
                result = result + (second - first);
                System.out.println("condn 6: " + result);
                i++;

            } else {
                result = result + hm.get(c0);
                System.out.println("else: " + result);

            }

            if (i == s.length()-1) {
                result = result + hm.get(s.charAt(s.length() - 1));
                System.out.println("else else: " + result);
            }
        }

        return result;
    }
}

public class roman_to_integer_13 {

    public static void main(String[] args) {
        String s = "MDCXCV";
        Solution sol = new Solution();
        System.out.println("Result: " + sol.romanToInt(s));
    }
}
