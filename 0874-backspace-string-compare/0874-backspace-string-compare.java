class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str){
        StringBuilder result=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='#'){
                if(result.length()>0){
                    result.deleteCharAt(result.length()-1);
                }
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}