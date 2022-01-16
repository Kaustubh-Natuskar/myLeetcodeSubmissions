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
    public boolean isUnivalTree(TreeNode root) {
        
        if(root == null)
            return true;
        
        int uniValue = root.val;
        
        return isUnivalTreeSolution(root,uniValue,true);
    }
    
    public boolean isUnivalTreeSolution(TreeNode root,int uniValue, boolean isCurrUni){
        
        if(root == null)
            return true;
        
        if(root.val == uniValue){
            isCurrUni = true;
            boolean left = isUnivalTreeSolution(root.left,uniValue,isCurrUni);
            boolean right = isUnivalTreeSolution(root.right,uniValue,isCurrUni);
            return left && right;
        }
        else{
            isCurrUni = false;
            return false;
        }
        
    }
}