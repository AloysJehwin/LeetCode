class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
    paragraph = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase();

    String[] words = paragraph.split("\\s+");

    Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

    Map<String, Integer> map = new HashMap<>();
    for (String word : words) {
        if (!bannedSet.contains(word) && !word.isEmpty()) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
    }

    String mostCommon = "";
    int maxCount = 0;
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        if (entry.getValue() > maxCount) {
            mostCommon = entry.getKey();
            maxCount = entry.getValue();
        }
    }

    return mostCommon;
}

}