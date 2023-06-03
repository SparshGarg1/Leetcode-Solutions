class Solution {
    public int trap(int[] arr) 
    {
        int n = arr.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];

        prefix[0]=arr[0];
        suffix[n-1]=arr[n-1];

        for(int i=1; i<n; i++)
        {
            prefix[i]=Math.max(prefix[i-1],arr[i]);
            suffix[n-i-1]=Math.max(suffix[n-i-1+1],arr[n-i-1]);
        }
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) 
        {
            waterTrapped += Math.min(prefix[i], suffix[i]) - arr[i];
        }
        return waterTrapped;
    }
}