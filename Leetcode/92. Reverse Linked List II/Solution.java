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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null)
            return head;
        ListNode dummy = new ListNode(0,head);
        ListNode leftPrev=dummy,curr=head;

        // 1) Reaching the Reversing Node at postion Left
        for(int i=0;i<left-1;i++)
        {
            leftPrev =curr;
            curr = curr.next;
        }

        //2) Now Curr=left(reversing point) LeftPrev = node before left (Node before the reversing node)
        // Now Reverse from left right
        ListNode prev = null;
        for(int i=0;i<right-left+1;i++)
        {
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }

        // 3)Update the head and tail Nodes of the reversed list.
        leftPrev.next.next = curr;
        leftPrev.next = prev;

        return dummy.next;
    }
}