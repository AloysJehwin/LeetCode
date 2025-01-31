class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0) return m*n;
        int min_a=m;
        int min_b=n;
        for(int[] op:ops){
            min_a=Math.min(min_a, op[0]);
            min_b=Math.min(min_b, op[1]);
        }
        return min_a*min_b;
    }
}