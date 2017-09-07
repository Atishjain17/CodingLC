//O(nlogk)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length==0) return null;
        ListNode ans = new ListNode(0);

        PriorityQueue<ListNode> pri_queue = new PriorityQueue<ListNode>(lists.length, new ListNodeComparator());
        
        for (ListNode Linkedlist : lists){
            if (Linkedlist !=null)
                pri_queue.add(Linkedlist);
        }
        ListNode current = ans;
        
        while (!pri_queue.isEmpty()){
            ListNode node = pri_queue.poll();
            if(node.next!=null){
                pri_queue.add(node.next);
                node.next = null;
            }
            current.next = node;
            current = current.next;
        }
        
        return ans.next;
    }
    private class ListNodeComparator implements Comparator<ListNode> {
        @Override
        public int compare(ListNode n1, ListNode n2) {
            return Integer.compare(n1.val, n2.val);
        }
    }
}