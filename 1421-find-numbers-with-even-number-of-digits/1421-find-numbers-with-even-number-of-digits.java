class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(calculateDigits(num)%2==0){
                count++;
            }
        }
        return count;
    }
    private int calculateDigits(int num){
        int digit=0;
        while (num>0) {
            num=num/10;
            digit++;
        }
        return digit;
    }
}