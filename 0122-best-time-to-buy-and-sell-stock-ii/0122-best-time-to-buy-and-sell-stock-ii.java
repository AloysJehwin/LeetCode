class Solution {
    public static int maxProfit(int[] nums){
        int maxProfit=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                maxProfit+=nums[i]-nums[i-1];
            }
        }
        return maxProfit;
    }
} 