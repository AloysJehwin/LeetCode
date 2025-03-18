class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLen = 0;
        int left = 0;
        int bitmask = 0; 
        
        for (int right = 0; right < nums.length; right++) {
            while ((bitmask & nums[right]) != 0) { 
                bitmask ^= nums[left]; 
                left++;
            }
            
            bitmask |= nums[right]; 
            
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}