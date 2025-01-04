class Solution {
    public int hIndex(int[] citations) {
        if(citations==null || citations.length==0){
            return 0;
        }
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=0;i<n;i++){
            int h=n-i;
            if(citations[i]>=h){
                return h;
            }
        }
        return 0;
    }
}