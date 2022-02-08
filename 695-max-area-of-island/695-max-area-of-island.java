class Solution {
    int ans=0;
    int tempAns=0;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    currArea(grid,i,j,n,m);
                    if(tempAns > ans)
                        ans = tempAns; 
                }
                tempAns = 0;
            }
        }
        return ans;
    }
    public void currArea(int[][] grid, int cR, int cC, int n, int m){
        
        if(cR < 0 || cC < 0 || cR >= n || cC >= m || grid[cR][cC] == 0)
            return;
        tempAns++;
        grid[cR][cC] = 0;
        currArea(grid, cR, cC+1, n, m);
        currArea(grid, cR+1, cC, n, m);
        currArea(grid, cR, cC-1, n, m);
        currArea(grid, cR-1, cC, n, m);
        
    }
}