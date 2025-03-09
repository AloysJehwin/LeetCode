class Solution {
    public int countBinarySubstrings(String s) {
        int currCount=1,prevCount=0,result=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currCount++;
            }else{
                result+=Math.min(currCount, prevCount);
                prevCount=currCount;
                currCount=1;
            }
        }
        result+=Math.min(prevCount, currCount);
        return result;
    }
}