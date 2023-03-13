/**
 * Definition for singly-linked list.
  */
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public int getDecimalValue(ListNode head) {
        int count = head.val;
        head = head.next;
        while(head!=null)
        {
            count =(count<<1)|head.val;
            head = head.next;
        }
       
        return count;
    }
}