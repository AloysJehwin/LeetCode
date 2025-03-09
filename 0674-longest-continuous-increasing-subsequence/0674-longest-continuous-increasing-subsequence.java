class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int currLen=1;
        int maxLen=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                currLen++;
            }else{
                maxLen=Math.max(maxLen, currLen);
                currLen=1;
            }
        }
        return Math.max(currLen,maxLen);
    }
}