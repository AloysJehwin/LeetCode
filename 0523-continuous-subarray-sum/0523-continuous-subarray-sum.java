class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> reminderMap=new HashMap<>();
        reminderMap.put(0, -1);
        int prefixSum=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int reminder= k==0 ? prefixSum:prefixSum%k;
            if(reminder<0){
                reminder+=k;
            }
            if(reminderMap.containsKey(reminder)){
                if(i-reminderMap.get(reminder)>1){
                    return true;
                }
            }else{
                reminderMap.put(reminder, i);
            }
        }
        return false;
    }
}