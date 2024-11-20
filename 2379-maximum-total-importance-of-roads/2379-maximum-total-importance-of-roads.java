class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] degree=new int[n];
        for(int[] road:roads){
            degree[road[0]]++;
            degree[road[1]]++;
        }
        Integer[] cities=new Integer[n];
        for(int i=0;i<n;i++){
            cities[i]=i;
        }
        Arrays.sort(cities,(a,b)->degree[b]-degree[a]);
        int[] important=new int[n];
        int importantVal=n;
        for(int city:cities){
            important[city]=importantVal--;
        }
        long total=0;
        for(int[] road:roads){
            total+=important[road[0]]+important[road[1]];
        }
        return total;
      }
}