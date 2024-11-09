class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubleStr=s+s;
        String maxDouble=doubleStr.substring(1,doubleStr.length()-1);
        return maxDouble.contains(s);

    }
}