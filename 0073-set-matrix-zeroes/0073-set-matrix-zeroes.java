class Solution {
    public static int[][] setZeroes(int[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        boolean zero1strow=false;
        boolean zero1stcol=false;

        for(int i=0;i<col;i++){
            if(matrix[0][i]==0){
                zero1stcol=true;
                break;
            }
        }
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0){
                zero1strow=true;
                break;
            }
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][j]=0;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(zero1stcol){
            for(int i=0;i<col;i++){
                matrix[0][i]=0;
            }
        }
        if(zero1strow){
            for(int i=0;i<row;i++){
                matrix[i][0]=0;
            }
        }
        return matrix;
    }
}