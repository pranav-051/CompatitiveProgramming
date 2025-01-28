
class stringOperations {

    public void traversal(String str) {
        int length = str.length();
        System.out.print("String Traversal: ");
        for (int i = 0; i < length; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public void printASCII(String str) {
        int length = str.length();

        System.out.print("ASCII: ");
        for (int i = 0; i < length; i++) {
            int ascii = (int) str.charAt(i);
            System.out.print(ascii + " ");
        }
        System.out.println();
    }

    public void printUpperCase(String str) {
        System.out.print("Upper case characters: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    public void printLowerCase(String str) {
        System.out.print("Lower case characters: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    public void printDigits(String str) {
        System.out.print("Digits only: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    public void printAlphabates(String str) {
        System.out.print("Alphabates only: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    public void removeWhiteSpaces(String str) {
        System.out.print("Removed WhiteSpaces: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                System.out.print(c);
            }
        }
        System.out.println();
    }

    public void countUpperAndLowerCase(String str) {
        int length = str.length();
        int lowerCount = 0, upperCount = 0, digitCount = 0;

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                upperCount++;
            }
            if (Character.isLowerCase(c)) {
                lowerCount++;
            }
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        System.out.println("Uppercase characters count: " + upperCount);
        System.out.println("Lowercase character count: " + lowerCount);
        System.out.println("Digit count: " + digitCount);
    }

    public void countVowels(String str) {
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'A' || c == 'a' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'U'
                    || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Vowel Count: " + vowelCount);
    }

    public void onlyUpperAndonlyLower(String str) {
        int length = str.length();
        String upper = "", lower = "";

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                upper += c;
            }

            if (Character.isLowerCase(c)) {
                lower += c;
            }
        }

        String combo = "";
        combo = combo + upper + lower;

        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
        System.out.println("Combination: " + combo);
    }

    public void digitFirst(String str) {
        String characters = "";
        String digits = "";
        String combo = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetter(c)) {
                characters += c;
            }

            if (Character.isDigit(c)) {
                digits += c;
            }
        }

        combo = combo + digits + characters;
        System.out.println("Digit First: " + combo);
    }

    public void reverse(String str) {
        String reversedStr = "";
        System.out.print("Reversed String: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            reversedStr = reversedStr + c;
        }
        System.out.println(reversedStr);
    }

    public void checkPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            rev = rev + c;
        }

        if (rev.equalsIgnoreCase(str)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }

    public void piglatin(String str) {
        int length = str.length();
        String piglatinString = "";

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            char upperC = Character.toUpperCase(c);

            if (upperC == 'A' || upperC == 'E' || upperC == 'I' || upperC == 'O' || upperC == 'U') {
                if (i == 0) {
                    piglatinString = piglatinString + str + "WAY";
                    break;
                } else {
                    piglatinString = piglatinString + str.substring(i) + str.substring(0, i) + "WAY";
                    break;
                }
            }
        }
        System.out.println("Piglatin string: " + piglatinString);
    }
    
    public void encodeString(String str) {
        int length = str.length();
        String encoded = "";
        
        for (int i = 0; i < length; i++) {
            int c = ((int) (str.charAt(i))) + 2;
            char newC = (char) c;

            encoded = encoded + newC;
        }
        
        System.out.println("Encoded String: "+encoded);
    }

}

public class StringOperations1{

    public static void main(String[] args) {
        String str = "ABC";
        stringOperations SO = new stringOperations();
        SO.traversal(str);
        SO.printASCII(str);
        SO.printUpperCase(str);
        SO.printLowerCase(str);
        SO.printDigits(str);
        SO.printAlphabates(str);
        SO.countUpperAndLowerCase(str);
        SO.countVowels(str);
        SO.onlyUpperAndonlyLower(str);
        SO.digitFirst(str);
        SO.removeWhiteSpaces(str);
        SO.reverse(str);
        SO.checkPalindrome(str);
        SO.piglatin(str);
        SO.encodeString(str);
    }
}
