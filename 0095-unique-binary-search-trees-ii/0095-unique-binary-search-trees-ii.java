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
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<>();
        return generateTreesInRange(1,n);
    }
    public List<TreeNode> generateTreesInRange(int start,int end){
        List<TreeNode> result=new ArrayList<>();
        if(start>end){
            result.add(null);
            return result;
        }

        for(int i=start;i<=end;i++){
            List<TreeNode> leftSub=generateTreesInRange(start,i-1);
            List<TreeNode> rightSub=generateTreesInRange(i+1,end);
            for(TreeNode left:leftSub){
                for(TreeNode right:rightSub){
                    TreeNode root=new TreeNode(i);
                    root.left=left;
                    root.right=right;
                    result.add(root);
                }
            }
        }
        return result;
    }
}