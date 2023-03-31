class Pair
{
    int i,j;
    Pair(int i, int j)
    {
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) 
    {
        Queue<Pair> res = new LinkedList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] i : intervals)
        {
            if(i[0]<=end)
            {
                end=Math.max(end,i[1]);
            }
            else
            {
                res.add(new Pair(start,end));
                start=i[0];
                end=i[1];
            }
        }
        res.add(new Pair(start,end));
        int r=0;
        int arr[][] = new int[res.size()][2]; 
        while(!res.isEmpty())
        {
           
            Pair p1 = res.poll();
            int i1=p1.i;
            int j1=p1.j;
            arr[r][0]=i1;
            arr[r][1]=j1;
            r++;
        }
         return arr;
    }
}