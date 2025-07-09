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
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> tempAns = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        traverse(root, targetSum);
        return ans;
    }

    public void traverse(TreeNode root, int targetSum) {
        if(root == null)
            return;
        targetSum = targetSum - root.val;
        tempAns.add(root.val);

        if(root.left == null && root.right == null && targetSum == 0) {
            ans.add(new ArrayList<>(tempAns));
        }
        traverse(root.left, targetSum);
        traverse(root.right, targetSum);
        tempAns.remove(tempAns.size()-1);
    }
}