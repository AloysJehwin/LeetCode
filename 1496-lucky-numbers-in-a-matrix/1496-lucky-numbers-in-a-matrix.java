class Solution {
    public List<Integer> luckyNumbers(int[][] matrix){
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            int minIndex=-1;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    minIndex=j;
                }
            }
            boolean isLucky=true;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][minIndex]>min){
                    isLucky=false;
                    break;
                }
            }
            if(isLucky){
                result.add(min);
            }
        }
        return result;
    }
}