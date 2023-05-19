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
	//Length Function
	 public static int length(ListNode head)
	 {
		if(head==null)
			return 0;
		int count =0;
		ListNode current = head;
		while(current != null)
		{
			count ++;
			current = current.next;
		}
		return count;
	}

  	public ListNode middleNode(ListNode head) 
    {

        int n =(length(head)+1)/2;
				if(length(head)%2!=0) n=length(head)/2;
				
				//Finding the middle node
        int count =0;
				ListNode current = head;
				while(current != null)
				{
					if(count==n) break;
					count++;
          current=current.next;
						
				}
        return current;
    }
}