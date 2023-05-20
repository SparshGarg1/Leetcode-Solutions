public class Solution {
    public static ListNode startNodeCycle(ListNode head) 
   {
       ListNode fastPtr = head;
       ListNode slowPtr = head;
       while(fastPtr != null && fastPtr.next != null)
       {
           fastPtr = fastPtr.next.next;
           slowPtr = slowPtr.next;
           if(slowPtr==fastPtr) 
               return getStartNode(slowPtr,head);
       }
       return null;
   }
   public static ListNode getStartNode(ListNode slowPtr,ListNode head)
   {
       ListNode temp =head;
       while(temp!=slowPtr)
       {
           slowPtr=slowPtr.next;
           temp=temp.next;
       }
       return temp;
   }
   public ListNode detectCycle(ListNode head) 
   {
       return startNodeCycle(head);
   }
}