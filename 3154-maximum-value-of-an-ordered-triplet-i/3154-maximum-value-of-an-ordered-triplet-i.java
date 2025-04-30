class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxValue=0;
        for(int i=0;i<nums.length;i++){
            for(int k=nums.length-1;k>i;k--){
                int j=i+1;
                while(j<k){
                    maxValue=Math.max(maxValue,(long)(nums[i]-nums[j])*nums[k]);
                    j++;
                }
            }
        }
        return Math.max(0,maxValue);
    }
}