class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        List<Integer> onlyAtNums1=new ArrayList<>();
        for(int num:set1){
            if(!set2.contains(num)){
                onlyAtNums1.add(num);
            }
        }
        List<Integer> onlyAtNums2=new ArrayList<>();
        for(int num:set2){
            if(!set1.contains(num)){
                onlyAtNums2.add(num);
            }
        }
        List<List<Integer>> result=new ArrayList<>();
        result.add(onlyAtNums1);
        result.add(onlyAtNums2);
        return result;
    }
}