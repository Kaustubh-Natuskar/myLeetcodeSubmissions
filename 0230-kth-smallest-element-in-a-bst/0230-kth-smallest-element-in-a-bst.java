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
    ArrayList<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        traverse(root);
        k--;
        int ans = -1;
        for(int i=0; i<list.size(); i++) {
            if(i == k) {
                ans = list.get(i);
            }
        }
        
        return ans;
    }
    public void traverse(TreeNode root) {
        if(root == null) 
            return;
        
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}