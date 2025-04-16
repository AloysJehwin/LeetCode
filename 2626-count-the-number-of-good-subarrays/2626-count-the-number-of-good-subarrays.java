class Solution {
    public long countGood(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    long count = 0;
    long pairs = 0;
    int left = 0;

    for (int right = 0; right < nums.length; right++) {
        int num = nums[right];
        int freq = map.getOrDefault(num, 0);

        pairs += freq;
        map.put(num, freq + 1);

        while (pairs >= k) {
            count += nums.length - right;

            int leftNum = nums[left];
            int leftFreq = map.get(leftNum);

            pairs -= (leftFreq - 1);
            map.put(leftNum, leftFreq - 1);
            left++;
        }
    }

    return count;
}

}