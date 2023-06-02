class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int len2 = nums2.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        st.push(nums2[len2-1]);
        map.put(nums2[len2-1],-1);
        for(int i=len2-2; i>=0; i--)
        {
            
            if(st.peek()>nums2[i]) 
            {
                map.put(nums2[i],st.peek());
                st.push(nums2[i]);
                continue;
            }
            
            while(!st.isEmpty() && st.peek()<nums2[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                map.put(nums2[i],-1);     
            }
            else
            {
                map.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);

            
        }
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.get(nums1[i]);
            
      return nums1;
    }
}