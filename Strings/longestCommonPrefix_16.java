
class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String res = ""; 
        int Arraylength = strs.length;
        int itemLength = strs[0].length(); 
        int index = 0;
        
        String character = ""; 
        character = character + strs[0].charAt(index);

        String check = ""; 
        
        for (int i = 1; i < Arraylength; i++) {
            check = check + strs[i].charAt(index); 
            if (character != check ) {
                break;
            }

            if (!res.contains(character)) {
                res = res + character; 
            } 
        }

        return res; 
   }
}

public class longestCommonPrefix_16 {
    public static void main(String[] args) {
        String[] strs = { "flnowers", "flnow", "flower", "flnights" }; 
        Solution o = new Solution();
        String result = o.longestCommonPrefix(strs);
        
        System.out.println("Result: "+result);
        
    }
}
