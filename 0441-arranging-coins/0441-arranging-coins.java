class Solution {
    public int arrangeCoins(int n){
        double k=(-1+Math.sqrt(1+8*(long) n))/2;
        return (int) k;
    }
}