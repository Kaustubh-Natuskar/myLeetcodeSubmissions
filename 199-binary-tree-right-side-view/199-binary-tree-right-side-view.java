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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        rightView(root,list,1);
        return list;
    }
    public void rightView(TreeNode root, ArrayList<Integer> list, int height){
        
        if(list.size() < height)
            list.add(root.val);
        
        if(root.right != null)
            rightView(root.right, list, height+1);
        
        if(root.left != null)
            rightView(root.left, list, height+1);
    }
}