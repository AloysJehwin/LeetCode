class Solution {
    public boolean canThreePartsEqualSum(int[] arr){
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }
        if(totalSum%3!=0){
            return false;
        }
        int sum=totalSum/3;
        int count=0;
        int currentSum=0;
        for(int num:arr){
            currentSum+=num;
            if(currentSum==sum){
                count++;
                currentSum=0;
            }
            if(count==3){
                return true;
            }
        }
        return false;
    }
}