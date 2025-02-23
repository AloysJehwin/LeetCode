class Solution {
    public int countPrimeSetBits(int left,int right){
        HashSet<Integer> primeSet=new HashSet<>();
        primeSet.add(2);
        primeSet.add(3);
        primeSet.add(5);
        primeSet.add(7);
        primeSet.add(11);
        primeSet.add(13);
        primeSet.add(17);
        primeSet.add(19);

        int count=0;
        for(int i=left;i<=right;i++){
            int setBits=Integer.bitCount(i);
            if(primeSet.contains(setBits)){
                count++;
            }
        }
        return count;
    }
}