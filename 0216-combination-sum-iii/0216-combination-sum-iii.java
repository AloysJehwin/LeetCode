class Solution {
    public List<List<Integer>> combinationSum3(int k,int n){
        List<List<Integer>> result=new ArrayList<>();
        backTrack(result,new ArrayList<>(),k,n,1);
        return result;
    }
    private void backTrack(List<List<Integer>> result,List<Integer> combinations,int k,int n,int start){
        if(combinations.size()==k && n==0){
            result.add(new ArrayList<>(combinations));
            return;
        }
        if(combinations.size()>k || n<0){
            return;
        }
        for(int i=start;i<=9;i++){
            combinations.add(i);
            backTrack(result, combinations, k, n-i,i+1);
            combinations.remove(combinations.size()-1);
        }
    }
}