class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxPos = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxPos = i;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (i != maxPos && nums[i] * 2 > max) {
                return -1;
            }
        }
        
        return maxPos;
    }
}
