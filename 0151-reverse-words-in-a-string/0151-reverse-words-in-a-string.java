class Solution {
    public String reverseWords(String s) {
        String[] words=s.split("\\s");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            if(!words[i].isEmpty()){
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}