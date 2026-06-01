class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        
        int[] count = new int[26];
        
        
        for (char ch : s.toCharArray()) {
            int idx = (int) ch - 97;
            count[idx] += 1;
        }
        
        
        for (char ch : t.toCharArray()) {
            int idx = (int) ch - 97;
            count[idx] -= 1;
            
            
            if (count[idx] < 0)
                return false;
        }
        
        
        return true;
    }
}