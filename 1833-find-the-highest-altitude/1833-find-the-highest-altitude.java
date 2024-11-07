class Solution {
    public int largestAltitude(int[] gain) {
        int gainAltitude=0;
        int maxAltitude=0;
        for(int g:gain){
            gainAltitude+=g;
            maxAltitude=Math.max(gainAltitude, maxAltitude);
        }
        return maxAltitude;
    }
}