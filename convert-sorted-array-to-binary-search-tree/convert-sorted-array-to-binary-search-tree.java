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
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0)
            return null;
        TreeNode head = worker(num,0,num.length-1);
        return head;
    }
    public TreeNode worker(int[] num, int low, int high){
        if(low>high)
            return null;
        int mid=(low+high)/2;
        TreeNode node =new TreeNode(num[mid]);
        node.left=worker(num,low,mid-1);
        node.right=worker(num,mid+1,high);
        return node;
    }
}