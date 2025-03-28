import java.util.*;

public class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
            for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        boolean[] visited = new boolean[n];
        int completeComponents = 0;
            for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, graph, visited, component);
                
                if (isComplete(component, graph)) {
                    completeComponents++;
                }
            }
        }
        
        return completeComponents;
    }
    
    private void dfs(int node, List<List<Integer>> graph, boolean[] visited, List<Integer> component) {
        visited[node] = true;
        component.add(node);
        
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, component);
            }
        }
    }
    
    private boolean isComplete(List<Integer> component, List<List<Integer>> graph) {
        int size = component.size();
        int expectedEdges = size * (size - 1) / 2;
        int actualEdges = 0;
        
        for (int node : component) {
            actualEdges += graph.get(node).size();
        }
        
        return actualEdges / 2 == expectedEdges;
    }
}
