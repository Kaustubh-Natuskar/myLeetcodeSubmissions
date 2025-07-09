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
        int[] ans = new int[2];
        ans[0] = k;
        traverse(root, ans);
        return ans[1];
    }
    public void traverse(TreeNode root, int[] ans) {
        if(root == null) 
            return;
        
        traverse(root.left, ans);
        ans[0] = ans[0] - 1;
        if(ans[0] == 0) {
            ans[1] = root.val;
            return;
        }
        traverse(root.right, ans);
    }
}