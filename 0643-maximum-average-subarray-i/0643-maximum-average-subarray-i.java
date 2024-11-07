class Solution {
    public double findMaxAverage(int[] nums,int k){
        int n=nums.length;
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        int maxSum=windowSum;
        for(int i=k;i<n;i++){
            windowSum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum, windowSum);
        }
        return (double) maxSum/k;
    }
}