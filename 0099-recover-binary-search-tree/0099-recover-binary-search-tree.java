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
    public void recoverTree(TreeNode root) {
        // Variables to store the nodes that need to be swapped
        TreeNode first = null;
        TreeNode second = null;
        TreeNode prev = null;

        // Perform inorder traversal and identify the swapped nodes
        TreeNode[] nodes = inorderTraversal(root, new TreeNode[] {null, null, null});

        // Unpack the identified nodes
        first = nodes[0];
        second = nodes[1];

        // Swap the values of the two nodes to restore the BST
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    private TreeNode[] inorderTraversal(TreeNode root, TreeNode[] nodes) {
        // Base case
        if (root == null) return nodes;

        // Recursively traverse the left subtree
        inorderTraversal(root.left, nodes);

        // Check for anomalies in the BST order
        if (nodes[2] != null && nodes[2].val > root.val) {
            if (nodes[0] == null) {
                nodes[0] = nodes[2]; // First node identified
            }
            nodes[1] = root; // Second node identified
        }

        // Update the previously visited node
        nodes[2] = root;

        // Recursively traverse the right subtree
        inorderTraversal(root.right, nodes);

        return nodes;
    }
}