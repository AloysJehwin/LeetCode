class Solution {
    public static long dividePlayers(int[] skills){
        Arrays.sort(skills);
        int n=skills.length;
        int targetSum=skills[0]+skills[n-1];
        long totalProduct=0;

        for(int i=0;i<n/2;i++){
            if(skills[i]+skills[n-1-i]!=targetSum){
                return -1;
            }
            totalProduct+=(long) skills[i]*skills[n-1-i];
        }
        return totalProduct;
    }
}