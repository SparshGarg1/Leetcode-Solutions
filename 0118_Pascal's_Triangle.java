class Solution {
    public List<List<Integer>> generate(int n) 
    {
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            al.add(new ArrayList<Integer>());
        }
        al.get(0).add(1);
        for(int i=1; i<n; i++)
        {
            for(int k=0; k<i+1; k++)
            {
                if(k==0 || k==i) al.get(i).add(1);
                else
                {
                    int r = al.get(i-1).get(k-1)+al.get(i-1).get(k);

                    al.get(i).add(r);
                }
            }
        }
        return al;
    }
}