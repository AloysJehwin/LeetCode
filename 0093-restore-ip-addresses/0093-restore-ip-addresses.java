class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result=new ArrayList<>();
        if(s==null || s.length()<4 || s.length()>12){
            return result;
        }
        backtrack(result,new ArrayList<>(),s,0);
        return result;
    }
    private void backtrack(List<String> result,List<String> current,String s,int start){
        if(current.size()==4){
            if(start==s.length()){
                result.add(String.join(".", current));
            }
            return;
        }
        for(int len=1;len<=3;len++){
            if(start+len>s.length()){
                break;
            }
            String segment=s.substring(start,start+len);
            if(isValidSegment(segment)){
                current.add(segment);
                backtrack(result, current, s, start+len);
                current.remove(current.size()-1);
            }
        }
    }
    private boolean isValidSegment(String segment){
        if(segment.length()>1 && segment.startsWith("0")){
            return false;
        }
        int value=Integer.parseInt(segment);
        return value>=0 && value<=255;
    }
}