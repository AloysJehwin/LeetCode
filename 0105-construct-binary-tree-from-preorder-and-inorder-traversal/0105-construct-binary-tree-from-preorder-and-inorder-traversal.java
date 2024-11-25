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
    public TreeNode buildTree(int[] preorder,int[] inorder){
        if(preorder==null || inorder==null || preorder.length!=inorder.length){
            return null;
        }
        Map<Integer,Integer> inorderIndexMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inorderIndexMap.put(inorder[i],i);
        }
        return buildTreeHelper(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inorderIndexMap);
    }

    private TreeNode buildTreeHelper(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd,Map<Integer,Integer> inorderIndexMap){
        if(preStart > preEnd || inStart>inEnd){
            return null;
        }
        int rootVal=preorder[preStart];
        TreeNode root=new TreeNode(rootVal);
        int rootIndex=inorderIndexMap.get(rootVal);
        int leftSize=rootIndex-inStart;
        root.left=buildTreeHelper(preorder, preStart+1, preEnd+leftSize, inorder, inStart, rootIndex-1, inorderIndexMap);
        root.right=buildTreeHelper(preorder, preStart+leftSize+1, preEnd, inorder, rootIndex+1, inEnd, inorderIndexMap);
        return root;
    }
}