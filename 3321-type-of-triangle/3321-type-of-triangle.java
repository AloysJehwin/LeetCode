class Solution {
    public String triangleType(int[] nums) {
        String res="none";
        if(nums==null || nums.length<3){
            res="Invalid";
        }
        int a=nums[0],b=nums[1],c=nums[2];
        if(a+b>c && b+c>a && c+a>b){
            if(a==b && b==c){
                res="equilateral";
            }else if(a==b || a==c || b==c){
                res="isosceles";
            }else{
                res="scalene";
            }
        }else{
            res="none";
        }
        return res;
    }
}