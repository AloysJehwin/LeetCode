class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int count = 0;

        for (int a : nums1) {
            for (int b : nums2) {
                int sum = a + b;
                sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
            }
        }

        for (int c : nums3) {
            for (int d : nums4) {
                int target = -(c + d);
                if (sumMap.containsKey(target)) {
                    count += sumMap.get(target);
                }
            }
        }

        return count;
    }
}