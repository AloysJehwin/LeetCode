class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> groupCount = new HashMap<>();
        int maxSize = 0;

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            groupCount.put(sum, groupCount.getOrDefault(sum, 0) + 1);
            maxSize = Math.max(maxSize, groupCount.get(sum));
        }

        int result = 0;
        for (int count : groupCount.values()) {
            if (count == maxSize) {
                result++;
            }
        }

        return result;
    }
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}