/*
 ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int n1 = 0, n2 = 0, carry = 0;
        ListNode *curr1 = l1, *curr2 = l2, *res = NULL;
        while( curr1 ){ curr1=curr1->next; n1++; }
        while( curr2 ){ curr2=curr2->next; n2++; } 
        curr1 = l1; curr2 = l2;
        while( n1 > 0 && n2 > 0){
            int sum = 0;
            if( n1 >= n2 ){ sum += curr1->val; curr1=curr1->next; n1--;}
            if( n2 > n1 ){ sum += curr2->val; curr2=curr2->next; n2--;}
            res = addToFront( sum, res );
        }
        curr1 = res; res = NULL;
        while( curr1 ){
            curr1->val += carry; carry = curr1->val/10;
            res = addToFront( curr1->val%10, res );
            curr2 = curr1; 
            curr1 = curr1->next;
            delete curr2;
        }
        if( carry ) res = addToFront( 1, res );
        return res;
    }
    ListNode* addToFront( int val, ListNode* head ){
        ListNode* temp = new ListNode(val);
        temp->next = head;
        return temp;
    }
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> n1 = new Stack<Integer>();
        Stack<Integer> n2 = new Stack<Integer>();
        int sum=0;
        while(l1!=null){
            n1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            n2.push(l2.val);
            l2=l2.next;
        }
        ListNode list = new ListNode(0);
        while (!n1.empty() || !n2.empty()) {
            if (!n1.empty()) sum += n1.pop();
            if (!n2.empty()) sum += n2.pop();
            list.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = list;
            list = head;
            sum /= 10;
        }
        return list.val == 0 ? list.next : list;

    }
}