class Solution {
    public int minReorder(int n,int[][] connections){
        List<List<int[]>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] conn:connections){
            int u=conn[0],v=conn[1];
            graph.get(u).add(new int[]{v,1});
            graph.get(v).add(new int[]{u,0});
        }
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[n];
        queue.add(0);
        visited[0]=true;
        int reOrderCount=0;
        while (!queue.isEmpty()) {
            int node=queue.poll();
            for(int[] neighbour:graph.get(node)){
                int nextNode=neighbour[0];
                int direction=neighbour[1];
                if(!visited[nextNode]){
                    visited[nextNode]=true;
                    queue.add(nextNode);
                    if(direction==1){
                        reOrderCount++;
                    }
                }
            }
        }
        return reOrderCount;

    }
}