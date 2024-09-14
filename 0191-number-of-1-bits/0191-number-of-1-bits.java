class Solution {
    public int hammingWeight(int n) {
        String binary=new String();
        binary=decimalToBinary(n);
        int count=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }

    private String decimalToBinary(int n){
        if(n==0){
            return "0";
        }
        StringBuilder result=new StringBuilder();
        while (n>0) {
            result.insert(0, n%2);
            n/=2;
        }
        return result.reverse().toString();
    }
}