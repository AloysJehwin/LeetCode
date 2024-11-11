/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0L, 1);  // Base case: a sum of 0 has one way to be achieved with no nodes.
        return dfs(root, 0, targetSum, prefixSumCount);
    }

    private int dfs(TreeNode node, long currentSum, int targetSum, HashMap<Long, Integer> prefixSumCount) {
        if (node == null) return 0;
        
        // Update the current path sum
        currentSum += node.val;
        
        // Calculate the number of valid paths that end at the current node
        int numPathsToCurrent = prefixSumCount.getOrDefault(currentSum - targetSum, 0);
        
        // Update the map with the current path sum
        prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        
        // Count paths in the left and right subtrees
        int count = numPathsToCurrent + dfs(node.left, currentSum, targetSum, prefixSumCount)
                    + dfs(node.right, currentSum, targetSum, prefixSumCount);
        
        // Remove the current path sum from the map for backtracking
        prefixSumCount.put(currentSum, prefixSumCount.get(currentSum) - 1);
        
        return count;
    }
}