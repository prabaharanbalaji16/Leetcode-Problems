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
 import java.math.BigInteger;  
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int d1 = (l1==null)?0:l1.val;
            int d2 = (l2==null)?0:l2.val;
            int sum = d1+d2+carry;
            int d = sum%10;
            carry = sum/10;

            node.next = new ListNode(d);
            node = node.next;
            l1 = (l1!=null)?l1.next:null;
            l2 = (l2!=null)?l2.next:null;
        }
        ListNode head = dummy.next;
        dummy.next=null;
        return head;
    }
}