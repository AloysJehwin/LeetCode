class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (isValidPartition(String.valueOf(square), 0, i)) {
                sum += square;
            }
        }
        return sum;
    }

    private boolean isValidPartition(String s, int index, int target) {
        if (index == s.length()) return target == 0;
        
        int num = 0;
        for (int j = index; j < s.length(); j++) {
            num = num * 10 + (s.charAt(j) - '0');
            if (num > target) break;
            if (isValidPartition(s, j + 1, target - num)) return true;
        }
        return false;
    }
}
