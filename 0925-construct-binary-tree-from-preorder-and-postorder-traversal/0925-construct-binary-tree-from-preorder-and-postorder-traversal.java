class Solution {
    int preIndex = 0, postIndex = 0;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return build(preorder, postorder);
    }
    private TreeNode build(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode(preorder[preIndex++]);
        if (root.val != postorder[postIndex]) {
            root.left = build(preorder, postorder);
        }
        if (root.val != postorder[postIndex]) {
            root.right = build(preorder, postorder);
        }
        postIndex++;
        return root;
    }
}
