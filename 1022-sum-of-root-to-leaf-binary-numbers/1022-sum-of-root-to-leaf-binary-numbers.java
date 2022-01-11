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
    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeafSolution(root, 0);
    }
   /* private int solu(TreeNode node, String s, int sum){
         MY SOLUTION WHICH WAS FAILING, NOOB APPROCH

        if(node.left == null && node.right == null){
            s.concat(Integer.toString(node.val));
            int decimal = Integer.parseInt(s,2);
            sum = sum + decimal;
            return sum;
        }
        
        s.concat(Integer.toString(node.val));
        
        sum = sum + solu(node.left, s, sum);
        s = s.substring(0, s.length()-1);
        
        sum = sum + solu(node.right, s, sum);
        s = s.substring(0, s.length()-1);
        
        return sum;
    } */
      public int sumRootToLeafSolution(TreeNode root, int val) {
          
        if (root == null) 
            return 0;
          
        val = val * 2 + root.val;
          
        if (root.left == null && root.right == null) 
            return val ;
          
        else {
            int left = sumRootToLeafSolution(root.left, val) ;
            int right = sumRootToLeafSolution(root.right, val);
            return left + right; 
        }
    }
}