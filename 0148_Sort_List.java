class Solution 
{
    public ListNode sortList(ListNode head) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            al.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(al);
        temp = head;
        for(int i : al)
        {
            temp.val=i;
            temp=temp.next;
        }
        return head;
    }
}