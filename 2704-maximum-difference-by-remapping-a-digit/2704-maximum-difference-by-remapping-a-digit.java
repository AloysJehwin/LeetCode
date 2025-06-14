public class Solution {
    public int minMaxDifference(int num) {
        String numStr = Integer.toString(num);

        char toReplaceMax = ' ';
        for (char c : numStr.toCharArray()) {
            if (c != '9') {
                toReplaceMax = c;
                break;
            }
        }
        String maxStr = (toReplaceMax == ' ') ? numStr : numStr.replace(toReplaceMax, '9');

        char toReplaceMin = ' ';
        for (char c : numStr.toCharArray()) {
            if (c != '0') {
                toReplaceMin = c;
                break;
            }
        }
        String minStr = (toReplaceMin == ' ') ? numStr : numStr.replace(toReplaceMin, '0');

        int maxVal = Integer.parseInt(maxStr);
        int minVal = Integer.parseInt(minStr);

        return maxVal - minVal;
    }
}
