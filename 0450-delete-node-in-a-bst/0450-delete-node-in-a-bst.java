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
    public static TreeNode deleteNode(TreeNode root,int target){
        if(root==null){
            return root;
        }
        if(root.val>target){
            root.left=deleteNode(root.left, target);
        }else if(root.val<target){
            root.right=deleteNode(root.right, target);
        }else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            TreeNode succ=getSuccessor(root);
            root.val=succ.val;
            root.right=deleteNode(root.right,succ.val);
        }
        return root;
    }

    public static TreeNode getSuccessor(TreeNode root){
        root=root.right;
        while (root!=null && root.left!=null) {
            root=root.left;
        }
        return root;
    }
}