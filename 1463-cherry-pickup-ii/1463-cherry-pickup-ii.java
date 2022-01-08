class Solution {
    public int cherryPickup(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int dp[][][]=new int[row][col][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        dfs(0,0,col-1,dp,grid);
        return dp[0][0][col-1];
    }
    
    static int dfs(int r,int c1,int c2,int dp[][][],int grid[][])
    {
        if(r>=grid.length || c1<0 || c1>=grid[0].length || c2<0 || c2>=grid[0].length )
            return 0;
        
        if(dp[r][c1][c2]!=-1)
            return dp[r][c1][c2];
        
        int result=0;
        if(r<grid.length)
        {
            result+=grid[r][c1];
            if(c1!=c2)
                result+=grid[r][c2];
            
            int max=0;
            for(int i=c1-1;i<=c1+1;i++)
            {
                for(int j=c2-1;j<=c2+1;j++)
                {
                    max=Math.max(max,dfs(r+1,i,j,dp,grid));
                }
            }
            result+=max;
            dp[r][c1][c2]=result;
        }
        return result;
    }
}