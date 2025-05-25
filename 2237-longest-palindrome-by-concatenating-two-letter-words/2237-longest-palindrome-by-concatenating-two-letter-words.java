import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        int length = 0;
        boolean centralPalindromeUsed = false;

        for (String word : countMap.keySet()) {
            String reversed = new StringBuilder(word).reverse().toString();
            int wordCount = countMap.get(word);

            if (!word.equals(reversed)) {
                if (countMap.containsKey(reversed)) {
                    int pairCount = Math.min(wordCount, countMap.get(reversed));
                    length += pairCount * 4;
                    countMap.put(word, wordCount - pairCount);
                    countMap.put(reversed, countMap.get(reversed) - pairCount);
                }
            } else {
                int pairs = wordCount / 2;
                length += pairs * 4;
                if (wordCount % 2 == 1 && !centralPalindromeUsed) {
                    length += 2;
                    centralPalindromeUsed = true;
                }
            }
        }

        return length;
    }
}
