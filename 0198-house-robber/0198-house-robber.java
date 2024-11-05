class Solution {
    public int rob(int[] nums){
        if(nums==null || nums.length==0){
            return -1;
        }
        if(nums.length==1){
            return nums[0];
        }
        int include=nums[0];
        int exclude=0;
        for(int i=1;i<nums.length;i++){
            int newInclude=exclude+nums[i];
            exclude=Math.max(include, exclude);
            include=newInclude;
        }
        return Math.max(include, exclude);
    }
}