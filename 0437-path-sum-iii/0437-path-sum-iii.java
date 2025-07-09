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
    int ans = 0;
    public int pathSum(TreeNode root, int targetSum) {
        dfs(root, (long) targetSum);
        return ans;
    }
    public void dfs(TreeNode root, long targetSum) {
        if(root == null)
            return;

        traverse(root, targetSum);

        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
    }
    public void traverse(TreeNode root, long targetSum) {
        if(root == null)
            return;

        if(targetSum == root.val) {
            ans++;
        }
        traverse(root.left, targetSum - root.val);
        traverse(root.right, targetSum - root.val);
    }
}

