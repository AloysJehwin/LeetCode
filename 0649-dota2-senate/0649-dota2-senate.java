class Solution {
    public static String predictPartyVictory(String s){
        Queue<Integer> r=new LinkedList<>();
        Queue<Integer> d=new LinkedList<>();
        int i=0;
        for(char c:s.toCharArray()){
            if(c=='R'){
                r.offer(i++);
            }else{
                d.offer(i++);
            }
        }
        while (!r.isEmpty() && !d.isEmpty()) {
            if(r.peek()>d.peek()){
                d.offer(i++);
            }else{
                r.offer(i++);
            }
            d.poll();
            r.poll();
        }

        return r.isEmpty()? "Dire":"Radiant";
    }
}