/**
 * Definition for singly-linked list. */
  class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    ListNode temp;
    boolean stop;

    public void reorderList(ListNode head) {
        temp = head;
        stop = false;
        reorder(head);
    }
    private void reorder(ListNode head)
    {
        if(head==null) return;
        reorder(head.next);

        if(!stop)
        {
            ListNode next = temp.next;
            temp.next = head;
            head.next = next;
            temp = next;
        }

        if(temp!=null && temp.next==head)
        {
            stop = true;
            temp.next = null;
        }
    }
}