class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int spell=spells[i];
            long minPortion=((success+spell-1)/spell);
            int index=binarySearchII(potions,minPortion);
            result[i]=potions.length-index;
        }
        return result;
    }

    private int binarySearchII(int[] nums,long target){
        int left=0;
        int right=nums.length;
        while (left<right) {
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}