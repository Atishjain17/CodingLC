/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
   public ListNode reverseBetween(ListNode head, int m, int n) {    //LinkedList2
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
    
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 1;
        ListNode ans= head; 
        while (head!=null){
            head=head.next;
            count++;
       }
        int start = 1;
        int end = k;
        while (end<count){
            ans = reverseBetween(ans,start,end);
            start +=k;
            end+=k;
        }
        return ans;
    }
}