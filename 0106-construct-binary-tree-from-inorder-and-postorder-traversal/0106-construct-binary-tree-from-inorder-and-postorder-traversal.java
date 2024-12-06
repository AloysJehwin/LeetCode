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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length){
            return null;
        }
        return buildtreeHelper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }

    private TreeNode buildtreeHelper(int[] inOrder,int inStart,int inEnd,int[] postorder,int postStart,int postEnd){
        if(inStart>inEnd || postStart>postEnd){
            return null;
        }
        TreeNode root=new TreeNode(postorder[postEnd]);
        int rootIndex=inStart;
        for(; rootIndex<=inEnd;rootIndex++){
            if(inOrder[rootIndex]==root.val){
                break;
            }
        }
        int leftTreeSize=rootIndex-inStart;
        root.left=buildtreeHelper(inOrder, inStart, rootIndex-1, postorder, postStart, postStart+leftTreeSize-1);
        root.right=buildtreeHelper(inOrder, rootIndex+1, inEnd, postorder, postStart+leftTreeSize, postEnd-1);
        return root;
    }
}