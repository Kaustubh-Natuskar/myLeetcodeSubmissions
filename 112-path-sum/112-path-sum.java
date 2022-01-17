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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumSolu(root,targetSum,0);
    }
    public boolean hasPathSumSolu(TreeNode root, int targetSum, int currSum){
        
        if(root == null){
            return false;
        }
        
        if(root.left == null && root.right == null){
            return currSum + root.val == targetSum;
        }
        
        return hasPathSumSolu(root.left,targetSum,root.val+currSum) ||                         hasPathSumSolu(root.right,targetSum,root.val+currSum);
    }
}