class Solution {
    public int getDecimalValue(ListNode head) 
    {
        ListNode current = head;
        String binaryString = "";
        while(current !=null)
        {
            binaryString = binaryString + current.val;
            current = current.next;
        }
        return Integer.parseInt(binaryString,2);  
    }
}