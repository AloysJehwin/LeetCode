class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true; // Already equal
        
        int n = s1.length();
        if (n != s2.length()) return false; // Different lengths
        
        int first = -1, second = -1; // To track indices of mismatches
        int count = 0; // Count of mismatches
        
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1) first = i;
                else if (count == 2) second = i;
                else return false; // More than 2 mismatches
            }
        }
        
        // Exactly two mismatches, check if swapping fixes it
        return count == 2 && 
               s1.charAt(first) == s2.charAt(second) && 
               s1.charAt(second) == s2.charAt(first);
    }
}
