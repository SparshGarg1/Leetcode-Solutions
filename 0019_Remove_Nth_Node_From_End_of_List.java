class Solution {
    public static int length(ListNode head)
    {
        if(head==null) return 0;
        int count =0;
        ListNode current = head;
        while(current != null)
        {
            count++;
            current = current.next;
        }
				return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {

        int pos = length(head)-n+1;
        if(pos==1)
		{
			ListNode temp = head;
      		head = head.next;
      		temp.next = null;
      		return head;
		}
		else
		{
			ListNode previous = head;
			int count=1;
			while(count <pos-1)
			{
				previous=previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
			return head;
		}
    }
}