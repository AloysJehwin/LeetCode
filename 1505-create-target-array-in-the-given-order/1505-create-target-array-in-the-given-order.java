class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            target.add(index[i],nums[i]);
        }
        int[] result=new int[target.size()];
        int i=0;
        for(int num:target){
            result[i++]=num;
        }
        return result;
    }
}