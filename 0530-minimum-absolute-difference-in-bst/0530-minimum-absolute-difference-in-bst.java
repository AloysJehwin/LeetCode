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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> inOrder=new ArrayList<>();
        inOrderTraversal(root,inOrder);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<inOrder.size()-1;i++){
            min=Math.min(min,inOrder.get(i+1)-inOrder.get(i));
        }
        return min;
    }
    private void inOrderTraversal(TreeNode root,List<Integer> inOrder){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left, inOrder);
        inOrder.add(root.val);
        inOrderTraversal(root.right, inOrder);
    }
}