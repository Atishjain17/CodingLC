/*Add 2 numbers in linked list arranged with head as last digit*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans= new ListNode (0);
        ListNode result = ans;
        int sum=0;
        while(l1 != null || l2 != null){
            if(l1!= null)
            {
                sum +=l1.val;
                l1=l1.next;
            }
            if(l2!= null)
            {
                sum +=l2.val;
                l2=l2.next;
            }
            ans.next = new ListNode (sum%10);
            ans=ans.next;
            sum = sum/10;
        }
        if(sum!=0){
            ans.next = new ListNode (sum);
        }
        return result.next;
    }
}