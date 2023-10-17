import java.util.*;

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
    public ListNode reverseKGroup(ListNode head, int k) {
        // if(head==null || head.next==null)
            // return head;
        Stack<ListNode> stack = new Stack<>();
        ListNode curr =head;
        int i=1;
        ListNode rHead = null,tTail=null;
        // System.out.println(2%5==0);
        while(curr!=null)
        {
            if(i++%k==0)
            {   
                ListNode temp=null,tHead=null,fwdNext=null;

                if(rHead==null) rHead = curr;
                tHead = curr;
                fwdNext = curr.next;
                while(!stack.isEmpty())
                {
                    curr.next = stack.pop();
                    curr = curr.next;
                }
                if(tTail!=null) tTail.next = tHead;
                tTail = curr;
                curr.next = fwdNext;
            }
            else
                stack.push(curr);

            curr =curr.next;
        }
     return rHead;   
    }
}