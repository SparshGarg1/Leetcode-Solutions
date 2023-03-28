class Solution 
{
    public boolean check(int[] nums) 
    {
        int f=0;
        if(nums[nums.length-1]>nums[0]) f++;
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]>nums[i+1]) f++;
        }

        if(f==0 || f==1) return true;

        return false;
    }
}