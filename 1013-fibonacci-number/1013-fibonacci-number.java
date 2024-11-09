class Solution {
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int t0=0,t1=1;
        int tn=0;
        for(int i=2;i<=n;i++){
            tn=t0+t1;
            t0=t1;
            t1=tn;
        }
        return tn;
    }
}