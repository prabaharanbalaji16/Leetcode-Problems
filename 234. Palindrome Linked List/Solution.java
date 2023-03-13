/**
 * Definition for singly-linked list. 
 * */
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode secondHalf = findMid(head);
        secondHalf = reverse(secondHalf.next);
        
        while(secondHalf!=null)
        {
            if(head.val!=secondHalf.val)
                return false;
            head = head.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private ListNode findMid(ListNode head)
    {
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null)
        {
            ListNode temp = curr.next;
            curr.next= prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}