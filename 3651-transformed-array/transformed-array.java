class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                result[i]=0;
            }else{
                int newIndex=((i+nums[i]%n+n)%n);
                result[i]=nums[newIndex];
            }
        }
        return result;
    }
}