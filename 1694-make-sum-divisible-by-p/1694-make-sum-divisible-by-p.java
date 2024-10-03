class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int remainder = (int) (sum % p);
        if (remainder == 0) {
            return 0;
        }

        Map<Integer, Integer> prefixToIndex = new HashMap<>();
        prefixToIndex.put(0, -1);
        int prefix = 0;
        int ans = nums.length;

        for (int i = 0; i < nums.length; ++i) {
            prefix = (prefix + nums[i]) % p;
            int target = (prefix - remainder + p) % p;
            if (prefixToIndex.containsKey(target)) {
                ans = Math.min(ans, i - prefixToIndex.get(target));
            }
            prefixToIndex.put(prefix, i);
        }

        return ans == nums.length ? -1 : ans;
    }
}
