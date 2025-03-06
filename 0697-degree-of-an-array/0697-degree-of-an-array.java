class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> left=new HashMap<>();
        HashMap<Integer,Integer> right=new HashMap<>();
        HashMap<Integer,Integer> count=new HashMap<>();
        int maxDegree=0;
        for(int i=0;i<nums.length;i++){
            if(!left.containsKey(nums[i])){
                left.put(nums[i],i);
            }
            right.put(nums[i],i);
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
            maxDegree=Math.max(maxDegree,count.get(nums[i]));
        }
        int minLen=nums.length;
        for(int num:count.keySet()){
            if(count.get(num)==maxDegree){
                minLen=Math.min(minLen,right.get(num)-left.get(num)+1);
            }
        }
        return minLen;
    }
}