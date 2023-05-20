class Solution {
    public static int middle(ListNode head)
    {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        int count =1;
        while(fastPtr!=null && fastPtr.next!=null)
        {
            count ++;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return count;
    }
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head == null || head.next == null) return null;
        int count= middle(head);
        int c=1;
        ListNode previous = head; 
        while(c<count-1)
        {
            c++;
            previous = previous.next;
        }
        previous.next = previous.next.next;
        return head;
    }
}