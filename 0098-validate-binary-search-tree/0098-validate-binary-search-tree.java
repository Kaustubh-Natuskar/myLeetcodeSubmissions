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
    public boolean isValidBST(TreeNode root) {
        return ValidateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean ValidateBST(TreeNode root, long min, long max) {
        if(root == null)
            return true;

        if(!(min < root.val && root.val < max))
            return false;

        return ValidateBST(root.left, min, root.val) && ValidateBST(root.right, root.val, max);
    }
}