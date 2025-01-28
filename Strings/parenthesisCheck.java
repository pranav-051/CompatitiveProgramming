
import java.util.Stack;

class parenthesisCheck {

    public static boolean isMatchingPair(char open, char close) {
        if (open == '(' && close == ')') {
            return true;
        }
        if (open == '[' && close == ']') {
            return true;
        }
        if (open == '{' && close == '}') {
            return true;  
        }
        return false; 
    }

    public static boolean checkParenthesis(String s) {
        Stack<Character> myStack = new Stack<>();
        int stringLength = s.length();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                myStack.push(c);
            } else if (!myStack.isEmpty() || !isMatchingPair(myStack.pop(), c)) {
                return false;
            }
        }
        return myStack.isEmpty(); 
    }

    public static void main(String args[]) {
        String s = "[]";
        System.out.println("Paraenthesis are vaild: " + checkParenthesis(s));
    }
}
