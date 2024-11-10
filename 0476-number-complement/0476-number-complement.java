class Solution {
    public int findComplement(int num) {
        ArrayList<Integer> binary=new ArrayList<>();
        while (num!=0) {
            binary.add(num%2);
            num=num/2;
        }
        Collections.reverse(binary);

        for(int i=0;i<binary.size();i++){
            if(binary.get(i)==0){
                binary.set(i,1);
            }else{
                binary.set(i,0);
            }
        }
        int two=1;
        for(int i=binary.size()-1;i>=0;i--){
            num=num+binary.get(i)*two;
            two=two*2;
        }
        return num;
    }
}