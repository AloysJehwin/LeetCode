class Solution {
    public int findSubstringInWraproundString(String s) {
        if(s==null || s.length()==0) return 0;
        int[] dp=new int[26];
        int n=s.length();
        int maxLen=1;
        dp[s.charAt(0)-'a']=1;
        for(int i=1;i<n;i++){
            if((s.charAt(i)-s.charAt(i-1)+26)%26==1){
                maxLen++;
            }else{
                maxLen=1;
            }
            dp[s.charAt(i)-'a']=Math.max(dp[s.charAt(i)-'a'],maxLen);
        }
        int result=0;
        for(int i=0;i<26;i++){
            result+=dp[i];
        }
        return result;
        
    }
}