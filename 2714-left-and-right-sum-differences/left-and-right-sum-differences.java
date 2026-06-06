class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        int leftSum=0, rightSum=0;
        for(int num:nums) rightSum+=num;
        for(int i=0;i<n;i++){
            rightSum-=nums[i];
            result[i]=Math.abs(leftSum-rightSum);
            leftSum+=nums[i];
        }
        return result;
    }
}