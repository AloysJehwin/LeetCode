class Solution {
    public int jump(int[] nums){
        int totalJumps=0;
        int lastElement=nums.length-1;
        int coverage=0;
        int lastJump=0;
        if(nums.length==1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            coverage=Math.max(coverage, i+nums[i]);
            if(i==lastJump){
                lastJump=coverage;
                totalJumps++;
                if(coverage>=lastElement){
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }
}