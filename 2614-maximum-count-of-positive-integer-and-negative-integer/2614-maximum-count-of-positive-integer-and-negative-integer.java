class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;
        for(int num:nums){
            if(num!=0){
                if(num>0){
                    pos++;
                }else{
                    neg++;
                }
            }
        }
        return pos>neg?pos:neg;
    }
}