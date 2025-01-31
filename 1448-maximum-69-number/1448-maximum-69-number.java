class Solution {
    public int maximum69Number(int num) {
        String strNum=Integer.toString(num);
        for(int i=0;i<strNum.length();i++){
            if(strNum.charAt(i)=='6'){
                strNum=strNum.substring(0,i)+'9'+strNum.substring(i+1);
                break;
            }
        }
        return Integer.parseInt(strNum);
    }
}