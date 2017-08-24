/*2k=s+m+nr	2k-k = nr	k=nr	k=s+m	s=nr-m 	....2k+s = s+m+nr+nr-m = s+2nr */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head==null) return null;
        ListNode slow_pointer=head;
        ListNode fast_pointer=head;
        while(fast_pointer.next !=null && fast_pointer.next.next !=null){
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
            if(slow_pointer==fast_pointer){
                slow_pointer=head;
                while(slow_pointer!=fast_pointer){
                    slow_pointer=slow_pointer.next;
                    fast_pointer=fast_pointer.next;
                }
                return slow_pointer;
            }
        }
        return null;
    }
}
