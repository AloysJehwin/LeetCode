class Solution {
    public static int getSum(int a,int b){
        int s=a^b;
        int c=a&b;
        if(c==0){
            return s;
        }
        return getSum(s, c<<1);
    }
}