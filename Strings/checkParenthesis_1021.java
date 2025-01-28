
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
       int counter = 0; 
       
       for (char c : s.toCharArray()) {
          if (c == ')') {
              counter--;
          }
       
          if (counter > 0) {
              result.append(c);
          }
       
          if (c == '(') {
              counter++;
          }
       }
       return result.toString();
       } 
}

class checkParenthesis_1021 {
    public static void main(String[] args) {
        String s = "(())()";
        Solution o = new Solution();
        String result = o.removeOuterParentheses(s); 
        System.out.println("Result: "+result);
    }
}