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
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeavesSolution(root,false);
    }
    public int sumOfLeavesSolution(TreeNode root, boolean isLeft){
        
        if(root == null)
            return 0;
        
        if(root.left == null && root.right == null && isLeft == true)
            return root.val;
        
        int left = sumOfLeavesSolution(root.left, true);
        int right = sumOfLeavesSolution(root.right, false);
        
        return left + right;
    }
}