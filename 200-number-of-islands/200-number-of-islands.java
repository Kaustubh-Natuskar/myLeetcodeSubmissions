class Solution {
    public int numIslands(char[][] grid) {
       int n = grid.length;
        int m = grid[0].length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1'){
                  ans++;
                    dfs(i, j, grid, n, m);
                }
            }
        }
        return ans;
    }
    public void dfs(int cr, int cc, char[][] grid, int n, int m){
        if(cr < 0 || cc < 0 || cr >= n || cc >= m || grid[cr][cc] == '0')
            return;
        if(grid[cr][cc] == '1')
            grid[cr][cc] = '0';
        
        dfs(cr,cc+1,grid,n,m);
        dfs(cr+1,cc,grid,n,m);
        dfs(cr,cc-1,grid,n,m);
        dfs(cr-1,cc,grid,n,m);
    }
}