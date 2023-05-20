class Solution {
    public static ListNode reverse(ListNode head)
    {
        if(head==null)
        return head;
        ListNode current = head;
        ListNode previous= null;
        ListNode next = null;
        while(current != null)
        {
            next=current.next;
            current.next= previous;
            previous=current;
            current=next;
        }
    return previous;
    }
    public ListNode reverseList(ListNode head) 
    {
        
        return reverse(head);
    }
}