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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next ==null && n==1)
            return null;

        ListNode node = head;
        int i=0;
        while(node!=null)
        {
            i++;
            node = node.next;
        }
        i = i-n-1;
        if(i<0)
        {
            head = head.next;
            return head;
        }
        node = head;
        for(int j=0;j<i;j++)
            node = node.next;
        
        node.next = node.next.next;
        return head;
    }
}