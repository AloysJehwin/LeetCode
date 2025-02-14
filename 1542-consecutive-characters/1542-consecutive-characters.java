class Solution {
    public int maxPower(String s) {
        int count=1;
        int maxCount=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                count=1;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}