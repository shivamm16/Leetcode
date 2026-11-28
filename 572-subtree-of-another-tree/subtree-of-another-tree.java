class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if (root == null) return false;

        if (root.val == subRoot.val && solve(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean solve(TreeNode node1, TreeNode node2){

        if(node1 == null && node2 == null ) return true;

        if(node1 == null || node2 == null) return false;

        return (node1.val == node2.val) && solve(node1.left, node2.left) && solve(node1.right, node2.right);
    }
}