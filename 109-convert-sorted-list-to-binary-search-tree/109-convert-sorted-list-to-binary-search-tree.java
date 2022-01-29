/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
/*class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        
        if(head == null){
             TreeNode node=null;
            return node;
        }
        
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        
        return toBST(list,0,list.size()-1);
    }
     public TreeNode toBST(ArrayList<Integer> list, int low, int high){
        
        if(low>high)
            return null;
        
        int mid = low+(high-low)/2; // TO AVOID INT OVERFLOW
        
        TreeNode root = new TreeNode(list.get(mid));
        
        root.left=toBST(list,low,mid-1);
        root.right=toBST(list,mid+1,high);
        
        return root;
    }
} */
class Solution {
    public TreeNode sortedListToBST(ListNode head){
        
        if(head == null)
            return null;
        return toBST(head,null);
    }
    public TreeNode toBST(ListNode head,ListNode tail){
        if(head == tail)
            return null;
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=tail && fast.next!=tail){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        TreeNode root = new TreeNode(slow.val);
        
        root.left = toBST(head,slow);
        root.right = toBST(slow.next,tail);
        
        return root;
    }
}