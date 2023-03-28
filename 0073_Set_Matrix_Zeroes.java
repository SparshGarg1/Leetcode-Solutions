class Pair
{
    int i,j;
    Pair(int i, int j)
    {
        this.i = i;
        this.j = j;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) 
    {
       Queue<Pair> p = new LinkedList<>();
       int n = matrix.length;
       int m = matrix[0].length;
       for(int i=0; i<n; i++)
       {
           for(int j=0; j<m; j++)
           {
               if(matrix[i][j]==0)
               {
                   p.add(new Pair(i,j));
               }
           }
       } 
       while(!p.isEmpty())
       {
           Pair a = p.poll();
           int i1 = a.i;
           int j1 = a.j;
           for(int k=0;k<m;k++)
           {
               matrix[i1][k]=0;
           }
           for(int k=0;k<n;k++)
           {
               matrix[k][j1]=0;
           }
       }

    }
}