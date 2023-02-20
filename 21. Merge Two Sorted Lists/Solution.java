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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if(list1==null && list2==null)
       {
           return null;
       }
       if(list1==null)
       {
           return list2;
       }
       if(list2==null)
       {
           return list1;
       }
       ListNode merged =  new ListNode();
       ListNode merge = merged;
       while(list1!=null && list2!=null)
       {
           if(list1.val<=list2.val)
           {
               merged.next = list1;
               list1 = list1.next;
           }
           else if(list1.val>list2.val)
           {
               merged.next = list2;
               list2 = list2.next;
           }
           merged = merged.next;
       }
       while(list2!=null)
       {
           merged.next = list2;
           list2 = list2.next;
           merged = merged.next;
       }
       while(list1!=null)
       {
           merged.next = list1;
           list1 = list1.next;
           merged = merged.next;
       }
       
       return merge.next;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }