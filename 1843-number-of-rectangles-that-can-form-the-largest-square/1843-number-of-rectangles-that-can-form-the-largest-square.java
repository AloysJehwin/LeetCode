class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen=0;
        int count=0;

        for(int[] rect:rectangles){
            int squareSide=Math.min(rect[0],rect[1]);

            if(squareSide>maxLen){
                maxLen=squareSide;
                count=1;
            }else if(squareSide == maxLen){
                count++;
            }
        }
        return count;
    }
}