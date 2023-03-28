class Solution {
    public int missingNumber(int[] nums) 
    {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
                map.put(nums[i],1);
        }
        for(int i=0; i<=n; i++)
        {
            if(map.get(i)==null) return i;
        }
        return -1;
    }
}