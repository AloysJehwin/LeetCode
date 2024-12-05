class Solution {
    public int[][] merge(int[][] intervals){
        if(intervals==null || intervals.length==0){
            return new int[0][0];
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merged=new ArrayList<>();
        int[] currentIntervals=intervals[0];
        merged.add(currentIntervals);
        for(int[] interval:intervals){
            if(interval[0]<=currentIntervals[1]){
                currentIntervals[1]=Math.max(currentIntervals[1],interval[1]);
            }else{
                currentIntervals=interval;
                merged.add(currentIntervals);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}