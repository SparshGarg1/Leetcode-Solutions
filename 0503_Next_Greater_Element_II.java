class Solution 
{
    public int[] nextGreaterElements(int[] nums) 
    {
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--)
        {
            st.push(nums[i]);
        }

        for(int i=nums.length-1; i>=0; i--)
        {
            if(st.isEmpty())
            {
                arr[i]=-1;
                st.push(nums[i]);
                continue;
            }

            else if(st.peek()>nums[i]) 
            {
                arr[i]=st.peek();
                st.push(nums[i]);
                continue;
            }

            while(!st.isEmpty() && st.peek()<=nums[i]) st.pop();

            if(st.isEmpty())
            {
                arr[i]=-1;
                st.push(nums[i]);
                
            }
            else
            {
                arr[i]=st.peek();
                st.push(nums[i]);
            }
        }
        return arr;
    }
}