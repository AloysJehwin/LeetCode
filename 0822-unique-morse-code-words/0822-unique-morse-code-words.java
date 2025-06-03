class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> uniqueWords=new HashSet<>();
        for(String word:words){
            StringBuilder sb=new StringBuilder();
            for(char c:word.toCharArray()){
                sb.append(codes[c-'a']);
            }
            uniqueWords.add(sb.toString());
        }
        return uniqueWords.size();
    }
}