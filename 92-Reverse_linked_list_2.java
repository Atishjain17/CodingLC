/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /*
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode (0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 0; i<m-1; i++) pre = pre.next;
    
        ListNode first = pre.next; // a pointer to the beginning of a sub-list that will be reversed
        ListNode second = first.next; // a pointer to a node that will be reversed
    
        for(int i=0; i<n-m; i++)
        {
            first.next = second.next;
            second.next = pre.next;
            pre.next = second;
            second = first.next;
        }
        
    return dummy.next;
    }
}
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int start=0;
        ListNode dummy = new ListNode (0);
        dummy.next = head;
        ListNode rev = null;
        ListNode slow = dummy;
        while (start<m-1){
            slow=slow.next;
            start ++;
        }
        ListNode ans=slow;
        slow=slow.next;
        start++;
        while (start<=n){
            ListNode next = slow.next;
            slow.next = rev;
            rev = slow;
            slow = next;
            start++;
        }
        ListNode result = dummy ;
        ans.next=rev;
        while (ans.next!=null) ans=ans.next;
        ans.next = slow;
        return result.next;
    }
}