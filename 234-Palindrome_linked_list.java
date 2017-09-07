/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode rev = null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null ){
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next =rev;
            rev = slow;
            slow = next;
        }
        if (fast!=null){
            slow = slow.next;            
        }
        while(slow!=null)
        {
            if(slow.val != rev.val)
                return false;
            slow=slow.next;
            rev=rev.next;
        }
        return true;
    }
}