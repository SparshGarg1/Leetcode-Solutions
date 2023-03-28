class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        
        int s = image[sr][sc];
      
                    dfs(sr, sc, image, color, s);
            
        return image;
    }
    public void dfs(int i, int j, int[][] image, int color, int s)
    {
        if(i<0 || j<0 || i>image.length-1 || j>image[0].length-1 || image[i][j]!=s)return;
         if(image[i][j]==color)return;

        image[i][j]=color;

        
        dfs(i+1,j,image, color ,s);

        
        dfs(i-1,j,image, color ,s);

       
        dfs(i,j-1,image, color ,s);

        
        dfs(i,j+1,image, color ,s);
    }
}