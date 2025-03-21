class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, Integer> inDegree = new HashMap<>();  
        Map<String, List<String>> graph = new HashMap<>(); 
        Set<String> available = new HashSet<>(Arrays.asList(supplies)); 
        List<String> result = new ArrayList<>();

        for (int i = 0; i < recipes.length; i++) {
            inDegree.put(recipes[i], ingredients.get(i).size()); 
            for (String ingredient : ingredients.get(i)) {
                graph.computeIfAbsent(ingredient, k -> new ArrayList<>()).add(recipes[i]);
            }
        }

        Queue<String> queue = new LinkedList<>();
        
        for (String supply : supplies) {
            queue.offer(supply);
        }

        while (!queue.isEmpty()) {
            String ingredient = queue.poll();
            
            if (!graph.containsKey(ingredient)) continue; 
            
            for (String recipe : graph.get(ingredient)) {
                inDegree.put(recipe, inDegree.get(recipe) - 1); 
                if (inDegree.get(recipe) == 0) { 
                    queue.offer(recipe);
                    result.add(recipe);
                }
            }
        }

        return result;
    }
}
