class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                int curr=triangle.get(i).get(j);
                int below=triangle.get(i+1).get(j);
                int belowRight=triangle.get(i+1).get(j+1);
                triangle.get(i).set(j,curr+Math.min(below,belowRight));
            }
        }
        return triangle.get(0).get(0);
    }
}