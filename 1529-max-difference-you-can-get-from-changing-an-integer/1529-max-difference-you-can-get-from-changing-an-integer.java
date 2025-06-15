class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);

        char[] chars = s.toCharArray();
        char toReplaceMax = 0;
        for (char c : chars) {
            if (c != '9') {
                toReplaceMax = c;
                break;
            }
        }
        String maxStr = s;
        if (toReplaceMax != 0) {
            maxStr = s.replace(toReplaceMax, '9');
        }
        int max = Integer.parseInt(maxStr);

        String minStr = s;
        if (s.charAt(0) != '1') {
            char toReplaceMin = s.charAt(0);
            minStr = s.replace(toReplaceMin, '1');
        } else {
            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != '0' && c != '1') {
                    minStr = s.replace(c, '0');
                    break;
                }
            }
        }
        int min = Integer.parseInt(minStr);

        return max - min;
    }
}
