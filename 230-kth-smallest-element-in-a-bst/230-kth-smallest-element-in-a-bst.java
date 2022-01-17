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
    int count = 1;
    public int kthSmallest(TreeNode root, int K) {
        if(root==null)
            return -1;
            
        int leftSubTree = kthSmallest(root.left, K);
        
        if(count==K){
            count = -1;
            return root.val;
        }
        if(count==-1)
            return leftSubTree;
        count++;
        
        int rightSubTree = kthSmallest(root.right, K);
        
        if(leftSubTree==-1)
            return rightSubTree;
        return leftSubTree;
    }
    
}