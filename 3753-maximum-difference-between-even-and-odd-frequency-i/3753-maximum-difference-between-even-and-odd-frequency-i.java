class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxOddFreq = Integer.MIN_VALUE;
        int minEvenFreq = Integer.MAX_VALUE;

        for (int f : freq) {
            if (f > 0) {
                if (f % 2 == 1) {
                    maxOddFreq = Math.max(maxOddFreq, f);
                } else {
                    minEvenFreq = Math.min(minEvenFreq, f);
                }
            }
        }

        return maxOddFreq - minEvenFreq;
    }
}
