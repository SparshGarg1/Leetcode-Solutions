class Solution {
    public boolean isPalindrome(ListNode head) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            al.add(temp.val);
            temp=temp.next;
        }
        for(int i=0; i<al.size()/2; i++)
        {
            if(al.get(i)!=al.get(al.size()-i-1)) return false;
        }
        return true;
    }
}