class Solution {
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj)
	{
		vis[node] = true;
		
		
		for(Integer it: adj.get(node))
		{
			if(vis[it] == false)
			{
				dfs(it, vis, adj);
			}
		}
	}
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<isConnected.length; i++)
        {
            for(int j=0; j<isConnected[i].length; j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int cnt=0;
        boolean vis[] = new boolean[adj.size()];
        for(int i=0; i<adj.size(); i++)
        {
            if(vis[i]==false)
            {
                cnt++;
                dfs(i, vis, adj);
            }
        }
        return cnt;
    }
}