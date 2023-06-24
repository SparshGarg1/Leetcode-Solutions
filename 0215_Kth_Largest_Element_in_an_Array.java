class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        //sort the array
        Arrays.sort(nums);

        //mark flag as 1
        int flag=1;

        //iterate the array from last and fing the kth largest number
        for(int i=nums.length-1; i>=0; i--)
        {
            if(flag==k)
            return nums[i];

            flag++;
        }
        return -1;
    }
}