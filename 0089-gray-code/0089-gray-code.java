class Solution {
    public List<Integer> grayCode(int n){
        List<Integer> result=new ArrayList<>();
        int numCode=1<<n;
        for(int i=0;i<numCode;i++){
            result.add(i^(i>>1));
        }
        return result;
    }
}