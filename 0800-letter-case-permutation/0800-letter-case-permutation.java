class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result=new ArrayList<>();
        backTrack(s.toCharArray(),0,result);
        return result;
    }
    private void backTrack(char[] chars,int index,List<String> result){
        if(index==chars.length){
            result.add(new String(chars));
            return;
        }
        if(Character.isLetter(chars[index])){
            chars[index]=Character.toLowerCase(chars[index]);
            backTrack(chars, index+1, result);

            chars[index]=Character.toUpperCase(chars[index]);
            backTrack(chars, index+1, result);
        }else{
            backTrack(chars, index+1, result);
        }

    }
}