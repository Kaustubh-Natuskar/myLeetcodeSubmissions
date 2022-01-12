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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root == null){
            TreeNode valNode = new TreeNode(val);
            root = valNode;
            return root;
        }
        
        TreeNode prev = null;
        TreeNode valNode = new TreeNode(val);
        
        prev = findPosForValInBST(root, prev, val);
        
        if(prev.val < val)
            prev.right = valNode;
        else
            prev.left = valNode;
       
        return root;
    }
    
    private TreeNode findPosForValInBST(TreeNode root, TreeNode prev, int val){
        
        if(root == null)
            return prev;
        
        prev = root;
        
        if(root.val < val)
            return findPosForValInBST(root.right, prev, val);
        else
            return findPosForValInBST(root.left, prev, val);
    }
}