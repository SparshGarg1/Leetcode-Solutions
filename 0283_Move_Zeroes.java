class Solution {
    public void moveZeroes(int[] nums) 
    {
        int n = nums.length;
        ArrayList<Integer> adj = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            if(nums[i]!=0) adj.add(nums[i]);
        }

        //Here, d is the number of zero's to be added in ArrayList
        int d =n-adj.size();
        while(d!=0)
        {
            adj.add(0);
            d--;
        }
        for(int i=0; i<n; i++)
        {
            nums[i] = adj.get(i);
        }
    }
}