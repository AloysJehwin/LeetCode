class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length<2 || arr==null){
            return false;
        }
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if((arr[i]-arr[i-1])!=d){
                return false;
            }
        }
        return true;
    }
}