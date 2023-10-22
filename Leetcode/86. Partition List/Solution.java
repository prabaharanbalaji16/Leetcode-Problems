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
    public ListNode partition(ListNode head, int x) {
        // ListNode dummy = new ListNode(0,head);
        // ListNode fast = dummy,fastPrev = fast;
        // while(fast!=null)
        // {
        //     System.out.println(fast.val);
        //     if(fast.val < x)
        //     {
        //         ListNode slow = dummy,slowPrev = slow;
        //         while(slow.val < x)
        //         {
        //             slowPrev = slow;
        //             slow = slow.next;
        //         }
        //         slowPrev.next = fast;
        //         fastPrev.next = fast.next;
        //         fast.next = slow;
        //         fast = fastPrev;
        //     }
        //     fastPrev = fast;
        //     fast = fast.next;
        // }
        // return dummy.next;

        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        ListNode beforePrev = before;
        ListNode afterPrev = after;

        while(head!=null)
        {
            if(head.val < x)
            {
                beforePrev.next = head;
                beforePrev = beforePrev.next;
            }
            else
            {
                afterPrev.next = head;
                afterPrev = afterPrev.next;
            }
            head = head.next;
            afterPrev.next = null;
            beforePrev.next = after.next;
        }
        return before.next;
    }
}