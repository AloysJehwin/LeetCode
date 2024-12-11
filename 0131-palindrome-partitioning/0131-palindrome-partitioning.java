class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(String s,int start,List<String> currentPartitioons,List<List<String>> result){
        if(start==s.length()){
            result.add(new ArrayList<>(currentPartitioons));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                currentPartitioons.add(s.substring(start,end+1));
                backtrack(s,end+1,currentPartitioons,result);
                currentPartitioons.remove(currentPartitioons.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}