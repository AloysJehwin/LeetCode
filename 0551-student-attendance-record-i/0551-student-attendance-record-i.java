class Solution {
    public boolean checkRecord(String s) {
        char[] letters=s.toCharArray();
        int a=0;
        for(int i=0;i<letters.length;i++){
            if(letters[i]=='A'){
                a++;
                if(a>=2){
                    return false;
                }
            }else if(letters[i]=='L'){
                if(i+2<letters.length && letters[i+1]=='L' && letters[i+2]=='L'){
                    return false;
                }
            }
        }
        
        return true;
    }
}