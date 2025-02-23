class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> result=new ArrayList<>();
        int start=rounds[0],end=rounds[rounds.length-1];
        if(start<=end){
            for(int i=start;i<=end;i++){
                result.add(i);
            }
        }else{
            for(int i=1;i<=end;i++){
                result.add(i);
            }
            for(int i=start;i<=n;i++){
                result.add(i);
            }
        }
        return result;
    }
}