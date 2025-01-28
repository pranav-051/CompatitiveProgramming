

/* 
class Solution{
    public boolean rotateString(String s, String goal) {
        s = s + " ";
        int length = s.length();
        String myWord = "";
        String newRotatedWord = ""; 
        
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (!Character.isWhitespace(c)) {
                myWord = myWord + c;
            } else {
                for (int j = 0; j < length; j++) {
                    char initialChar = myWord.charAt(0);
                   // System.out.println(initialChar);
                    newRotatedWord = newRotatedWord + myWord.substring(1, myWord.length());
                    //System.out.println(newRotatedWord);
                    newRotatedWord = newRotatedWord + initialChar;
                    System.out.println(newRotatedWord);

                    if (newRotatedWord.equals(goal))
                    {
                        return true;
                    }
                    myWord = "";
                    myWord = newRotatedWord;
                    newRotatedWord = "";
                }
                
                myWord = "";
            }
        }
        return false; 
    }
} */

class Solution {
    public boolean rotateString(String s, String goal) {
        int length = s.length();
        String newWord = "";

        if (s.length() != goal.length()) {
            return false;
        } else {
            for (int i = 0; i < length; i++) {
                char initialChar = s.charAt(0);
                newWord = newWord + s.substring(1, length) + initialChar;

                if (newWord.equals(goal)) {
                    return true;
                }

                s = newWord;
                newWord = "";

                System.out.println(s);
            }
        }

      
        return false;
    }
}

class rotate_sttring_796 {
    public static void main(String[] args) {
        String s1 = "abcde";
        String goal = "bcdea"; 

        Solution s = new Solution();
        boolean a = s.rotateString(s1, goal);
        
        System.out.println("Result: "+a);
    }
}