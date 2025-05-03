class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int actualSum=0;
        int expectedSum=(n*(n+1))/2;
        Set<Integer> numbers=new HashSet<>();
        int duplicate=0;
        for(int num:nums){
            actualSum+=num;
            if(numbers.contains(num)){
                duplicate=num;
            }else{
                numbers.add(num);
            }
        }
        int missing=expectedSum-(actualSum-duplicate);
        return new int[]{duplicate,missing};
    }
}