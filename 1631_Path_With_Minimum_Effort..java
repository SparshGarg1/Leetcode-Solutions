class Solution {
    class Pair{
        int i, j, diff;
        public Pair(int i, int j, int diff){
            this.i = i;
            this.j = j;
            this.diff = diff;
        }
    }
    public int minimumEffortPath(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] forw = {-1, 0, +1, 0};
        int[] back = {0, +1, 0, -1};
        int[][] dist = new int[n][m];
        if(n == 1 && m == 1){
            return 0;
        }
        for(int[] e : dist)
            Arrays.fill(e, Integer.MAX_VALUE);
        PriorityQueue<Pair> q = new PriorityQueue<Pair>((a, b) -> 
                                    a.diff- b.diff);
        q.offer(new Pair(0, 0, 0));
        dist[0][0] = 0;
        while(!q.isEmpty()){
            Pair front = q.poll();
            if(front.i == n-1 && front.j == m-1){
                return front.diff;
            }
            for(int ind = 0; ind< 4; ind++){
                int indexI = front.i+ forw[ind];
                int indexJ = front.j+ back[ind];
                if(indexI< n && indexJ< m && indexI >= 0 && indexJ >= 0){
                    int effort = Math.abs(mat[front.i][front.j]- mat[indexI][indexJ]);
                    effort = Math.max(effort, front.diff);
                    
                    if(effort < dist[indexI][indexJ]){
                        dist[indexI][indexJ] = effort;
                        q.offer(new Pair(indexI, indexJ, effort));
                    }
                }
            }
        }
        return dist[n-1][m-1];


    }
}