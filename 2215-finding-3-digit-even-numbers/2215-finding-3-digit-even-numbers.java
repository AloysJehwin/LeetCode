class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> numberSet=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i!=j && j!=k && k!=i){
                        int d1=digits[i];
                        int d2=digits[j];
                        int d3=digits[k];

                        if(d1!=0 && d3%2==0){
                            int num=d1*100+d2*10+d3;
                            numberSet.add(num);
                        }
                    }
                }
            }
        }
        List<Integer> resultList=new ArrayList<>(numberSet);
        Collections.sort(resultList);

        int[] result=new int[resultList.size()];
        for(int i=0;i<resultList.size();i++){
            result[i]=resultList.get(i);
        }
        return result;
    }
}