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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;

        while(fast!=null)
        {
            if(fast.next!=null && fast.val == fast.next.val)
            {
                while(fast.next!=null && fast.val == fast.next.val)
                    fast = fast.next;
                slow.next = fast.next;
            }
            else
                slow = fast;

            fast = fast.next;
        }
        return dummy.next;
    }
}