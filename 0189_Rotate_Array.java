class Solution {
    public void reverse(int s, int e, int arr[])
    {
        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) 
    {
        k=k%nums.length;
           reverse(0,nums.length-1,nums);
           reverse(0,k-1,nums);
           reverse(k,nums.length-1,nums);
       
    }
}