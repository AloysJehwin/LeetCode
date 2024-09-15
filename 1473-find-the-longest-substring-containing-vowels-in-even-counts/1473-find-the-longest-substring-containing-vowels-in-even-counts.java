class Solution {
    public int findTheLongestSubstring(String s){
        HashMap<Integer,Integer> maskMap=new HashMap<>();
        maskMap.put(0,-1);
        int mask=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                mask^=(1<<0);
            }else if(ch=='e'){
                mask^=(1<<1);
            }else if(ch=='i'){
                mask^=(1<<2);
            }else if(ch=='o'){
                mask^=(1<<3);
            }else if(ch=='u'){
                mask^=(1<<4);
            }

            if(maskMap.containsKey(mask)){
                maxlen=Math.max(maxlen,i-maskMap.get(mask));
            }else{
                maskMap.put(mask, i);
            }
        }
        return maxlen;
    }
}