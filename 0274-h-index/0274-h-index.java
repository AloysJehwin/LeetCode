class Solution {
    public int hIndex(int[] citaions){
        Arrays.sort(citaions);
        int n=citaions.length;
        int h=0;
        for(int i=0;i<n;i++){
            int papers=n-i;
            if(citaions[i]>=papers){
                h=papers;
                break;
            }
        }
        return h;
    }
}