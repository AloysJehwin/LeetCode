class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] newGrid=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int newCol=(j+k)%m;
                int wrapAround=(j+k)/m;
                int newRow=(i+wrapAround)%n;
                newGrid[newRow][newCol]=grid[i][j];
            }
        }
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<m;j++){
                row.add(newGrid[i][j]);
            }
            result.add(row);
        }
        return result;
    }
}