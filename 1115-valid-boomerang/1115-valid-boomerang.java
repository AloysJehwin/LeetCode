class Solution {
    public boolean isBoomerang(int[][] points) {
        if(isSame(points[0],points[1]) || isSame(points[1],points[2]) || isSame(points[0],points[2])){
            return false;
        }
        int x1=points[0][0],y1=points[0][1];
        int x2=points[1][0],y2=points[1][1];
        int x3=points[2][0],y3=points[2][1];
        return (y2-y1)*(x3-x1)!=(y3-y1)*(x2-x1);
    }
    private boolean isSame(int[] p1,int[] p2){
        return p1[0]==p2[0] && p1[1]==p2[1];
    }
}