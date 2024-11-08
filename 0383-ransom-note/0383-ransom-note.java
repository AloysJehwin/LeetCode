class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> magazineMap=new HashMap<>();
        for(char c:magazine.toCharArray()){
            magazineMap.put(c,magazineMap.getOrDefault(c, 0)+1);
        }

        for(char c:ransomNote.toCharArray()){
            if(magazineMap.getOrDefault(c,0)<=0){
                return false;
            }
            magazineMap.put(c,magazineMap.get(c)-1);
        }
        return true;
    }
}

