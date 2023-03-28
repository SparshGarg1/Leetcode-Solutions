class Solution 
{
    public int findMaxConsecutiveOnes(int[] arr) 
    {
        int flag=0;
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==1 && i==arr.length-1)
            { 
            flag++;
            ts.add(flag);
            }
            else if(arr[i]==1 && i!=arr.length-1)
            { 
            flag++;
            }
            else if(arr[i]==0)
            {
                ts.add(flag);
                flag=0;
            }
        }

        return ts.last();
    }
}