class Solution {
    public int numRescueBoats(int[] people,int limits){
        Arrays.sort(people);

        int i=0;
        int j=people.length-1;
        int boats=0;
        while (i<=j) {
            if(people[i]+people[j]<=limits){
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }
}