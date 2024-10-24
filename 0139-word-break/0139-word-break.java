class Solution {
    public static boolean wordBreak(String word,List<String> wordDict){
        Set<String> wordSet=new HashSet<>(wordDict);
        boolean[] dp=new boolean[word.length()+1];
        dp[0]=true;
        for(int i=1;i<=word.length();i++){
            for(int j=0;j<i;j++){
                if (dp[j] && wordSet.contains(word.substring(j, i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[word.length()];
    }
}