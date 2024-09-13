class Solution {
    public String convertToTitle(int coloumNum){
        StringBuilder result=new StringBuilder();
        while(coloumNum>0){
            coloumNum--;
            int reminder=coloumNum%26;
            char ch=(char)(reminder+'A');
            result.append(ch);
            coloumNum/=26;
        }
        return result.reverse().toString();
    }
}