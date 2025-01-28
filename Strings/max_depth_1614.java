class Solution {
    public int max (int i, int j)
    {
        if (i > j)
            return i;
            
        return j; 
    }
    public int maxDepth(String s) {
        int counter = 0;
        int result = 0; 
        
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            
            if (c == '(') {
                counter += 1;
                result = max(counter, result); 
            }
            
            if (c == ')') {
                counter -= 1; 
            }
        }

        return result; 
    }
}

public class max_depth_1614 {
    public static void main(String[] args) {
        String s = "()(())((()()))"; 
        Solution sol = new Solution();
        System.out.println("Result: "+ sol.maxDepth(s));        
    }    
}
