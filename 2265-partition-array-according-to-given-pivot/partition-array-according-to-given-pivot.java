class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less    = new ArrayList<>();
        List<Integer> equal   = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int x : nums) {
            if      (x < pivot)  less.add(x);
            else if (x == pivot) equal.add(x);
            else                 greater.add(x);
        }

        int i = 0;
        for (int x : less)    nums[i++] = x;
        for (int x : equal)   nums[i++] = x;
        for (int x : greater) nums[i++] = x;

        return nums;
    }
}