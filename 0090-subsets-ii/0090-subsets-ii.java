class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        backTrack(result,new ArrayList<>(),nums,0);
        return result;
    }
    private void backTrack(List<List<Integer>> result,List<Integer> subset,int[] nums,int start){
        result.add(new ArrayList<>(subset));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            subset.add(nums[i]);
            backTrack(result, subset, nums, i+1);
            subset.remove(subset.size()-1);
        }
    }
}