class Solution {
    public int maxProfit(int[] nums,int fee){
        int n=nums.length;
        if(nums.length<=1){
            return 0;
        }
        int cash=0;
        int hold=-nums[0];
        for(int i=0;i<n;i++){
            cash=Math.max(cash, hold+nums[i]-fee);
            hold=Math.max(hold,cash-nums[i]);
        }
        return cash;
    }
}