class Solution {
    public static int numDecodings(String s){
        int n=s.length();
        if(n==0 || s.charAt(0)=='0'){
            return 0;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            if(s.charAt(i-1)!='0'){
                dp[i]+=dp[i-1];
            }
            int twoDigit=Integer.parseInt(s.substring(i-2, i));
            if(twoDigit>=10 && twoDigit<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}