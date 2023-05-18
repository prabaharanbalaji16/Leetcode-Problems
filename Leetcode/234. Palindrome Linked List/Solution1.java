/**
 * Definition for singly-linked list.*/
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    ListNode ref;
    public boolean isPalindrome(ListNode head) {
        ref = head;
        return check(head);
    }

    boolean check(ListNode head)
    {
        if(head==null)
            return true;
        
        boolean checked = check(head.next);
        boolean equal = (ref.val==head.val) ? true :false;
        ref = ref.next;
        return equal && checked;
    }
}