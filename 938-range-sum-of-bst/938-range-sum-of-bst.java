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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)
            return 0;
        return rangeSumBSTSolution(root,low,high);
    }
    
    public int rangeSumBSTSolution(TreeNode root, int low, int high){
        
        if(root == null){
            return 0;
        }
        
        int currVal=root.val;
        
        if(! (currVal >= low && currVal <= high) ) {
            currVal=0;
        }
        
        return currVal + rangeSumBSTSolution(root.left, low, high) +rangeSumBSTSolution(root.right, low, high);
    }
}