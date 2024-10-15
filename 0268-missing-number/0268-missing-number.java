class Solution {
    public int missingNumber(int[] nums){
        int n=nums.length;
        int actualSum=(n*(n+1))/2;
        int currentSum=0;
        for(int num:nums){
            currentSum+=num;
        }
        return actualSum-currentSum;
    }
}