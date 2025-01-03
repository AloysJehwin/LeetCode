class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result=new ArrayList<>();
        if(s.length()<10){
            return result;
        }
        Set<String> seen=new HashSet<>();
        Set<String> repeated=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String sub=s.substring(i, i+10);
            if(!seen.add(sub)){
                repeated.add(sub);
            }
        }
        result.addAll(repeated);
        return result;    
    }
}