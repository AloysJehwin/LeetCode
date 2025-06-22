class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int grp=(n+k-1)/k;
        String[] result=new String[grp];
        for(int i=0;i<grp;i++){
            int start=i*k;
            int end=Math.min(start+k,n);
            StringBuilder sb=new StringBuilder(s.substring(start,end));
            while(sb.length()<k){
                sb.append(fill);
            }
            result[i]=sb.toString();
        }
        return result;
    }
}