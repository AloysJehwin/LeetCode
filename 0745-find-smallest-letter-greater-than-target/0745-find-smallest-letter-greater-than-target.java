class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int targetPos=(int)target-'a';
        int[] freq=new int[26];
        for(char c:letters){
            freq[(int)c-'a']++;
        } 
        for(int i=targetPos+1;i<26;i++){
            if(freq[i]!=0){
                return (char)(i+'a');
            }
        }
        return letters[0];
    }
}