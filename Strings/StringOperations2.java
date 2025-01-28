
import java.util.StringTokenizer;

class Operations {

    public void traversalUsingTokenizer(String str) {
        int length = str.length();
        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.print("Using StringTokenizer class: ");
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            System.out.print(word + "\t");
        }
        System.out.println();
    }

    public void traversal(String str) {
        str = str + " ";
        String myWord = "";
        int length = str.length();
        System.out.print("Using normal processing: ");
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                myWord += c;
            } else {
                System.out.print(myWord + "\t");
                myWord = "";
            }
        }
        System.out.println();
    }

    public void printFirstCharOnly(String str) {
        str = str + " ";
        int length = str.length();
        String myWord = "";

        System.out.print("First char of each word: ");
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                myWord = myWord + c;
            } else {
                System.out.print(myWord.charAt(0) + "\t");
                myWord = "";
            }
        }
        System.out.println();
    }

    public void printTwoCharEachWord(String str) {
        str = str + " ";
        int length = str.length();
        String myWord = "";

        System.out.print("First 2 char of each word: ");
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                myWord = myWord + c;
            } else {
                System.out.print(myWord.substring(0, 2) + "\t");
                myWord = "";
            }
        }
        System.out.println();
    }

    public void stratingWithH(String str) {
        str = str + " ";
        int length = str.length();
        String myWord = "";

        System.out.print("Strings starting with H: ");
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                myWord = myWord + c;
            } else {
                if (myWord.startsWith("H") || myWord.startsWith("h")) {
                    System.out.print(myWord + "\t");
                }
                //OR code        
                if (myWord.charAt(0) == 'h' || myWord.charAt(0) == 'H') {
                    System.out.print(myWord + "\t");
                }

                myWord = "";
            }
        }
        System.out.println();
    }

    public void specialWords(String str) {
        str = str + " ";
        int length = str.length();
        String myWord = "";

        System.out.print("Special Words that starts and end with same char: ");
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                myWord = myWord + c;
            } else {
                if (myWord.charAt(0) == myWord.charAt(myWord.length() - 1)) {
                    System.out.print(myWord + "\t");
                }
                myWord = "";
            }
        }
        System.out.println();
    }

    public int max(int i, int j) {
        if (i > j)
            return i;
        return j; 
    }
    public void longestWord(String str) {
        str = str + " ";
        int length = str.length();
        String myWord = "";
        int longestLengthWord = 0;
        String longWord = ""; 

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);

            if (!Character.isWhitespace(c)) {
                myWord = myWord + c;
            } else {
                longestLengthWord = max(longestLengthWord, myWord.length());

                if (myWord.length() > longWord.length())
                    longWord = myWord; 

                myWord = "";
            }
        }

        System.out.println("Longest word length: "+longestLengthWord+"  And word is : "+longWord);
    }


}

public class StringOperations2 {

    public static void main(String[] args) {
        String str = "Hell0 hello my 005500 name 1s1 JACK and hammerhhhhhh 123";
        Operations o = new Operations();
        o.traversalUsingTokenizer(str);
        o.traversal(str);
        o.printFirstCharOnly(str);
        o.printTwoCharEachWord(str);
        o.stratingWithH(str);
        o.specialWords(str);
        o.longestWord(str);
    }
}
