class Solution {
    public double myPow(double x,int n){
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        return fastPow(x,N);
    }
    private double fastPow(double X,long n){
        if(n==0){
            return 1.0;
        }

        double half=fastPow(X, n/2);
        if(n%2==0){
            return half*half;
        }else{
            return half*half*X;
        }
    }
}