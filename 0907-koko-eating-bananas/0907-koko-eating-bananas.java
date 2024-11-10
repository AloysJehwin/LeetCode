class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Arrays.stream(piles).max().getAsInt();
        while (left<right) {
            int mid=left+(right-left)/2;
            if(canEat(piles,h,mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

    private boolean canEat(int[] piles,int h,int k){
        int time=0;
        for(int pile:piles){
            time+=(pile+k-1)/k;
            if(time>h){
                return false;
            }
        }
        return time<=h;
    }
}