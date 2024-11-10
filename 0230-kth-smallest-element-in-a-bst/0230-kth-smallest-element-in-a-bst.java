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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> element=new ArrayList<>();
        inOrderTravel(root,element);
        return element.get(k-1);
    }

    private void inOrderTravel(TreeNode root,List<Integer> element){
        if(root==null){
            return;
        }
        inOrderTravel(root.left, element);
        element.add(root.val);
        inOrderTravel(root.right, element);
    }
}