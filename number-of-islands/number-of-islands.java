class Solution {
   public int numIslands(char[][] grid) {
        int i=0;
        int ans=0;
        while (i!=grid.length){
            int j=0;
            while (j!=grid[i].length){
                if (grid[i][j]=='1'){
                    ans++;
                    dfs(grid, i, j);
                }
                j++;
            }
            i++;
        }
        
        return ans;
    }
    private void dfs(char[][] grid, int x, int y){
        if (x>=grid.length || x<0 || y<0 || y>=grid[0].length || grid[x][y]=='0'){
            return;
        }
        grid[x][y]='0';
        dfs(grid,x-1,y);
        dfs(grid,x+1,y);
        dfs(grid,x,y-1);
        dfs(grid,x,y+1);
    }
    
    
}
/*
private void dfs(char[][] grid, int x, int y){
        if (x>=grid.length || x<0 || y<0 || y>=grid[0].length || grid[x][y]=='0'){
            return;
        }
        grid[x][y]='0';
        dfs(grid,x-1,y);
        dfs(grid,x+1,y);
        dfs(grid,x,y-1);
        dfs(grid,x,y+1);
    }
    
    public int numIslands(char[][] grid) {
        int i=0;
        int ans=0;
        while (i!=grid.length){
            int j=0;
            while (j!=grid[i].length){
                if (grid[i][j]=='1'){
                    ans++;
                    dfs(grid, i, j);
                }
                j++;
            }
            i++;
        }
        
        return ans;
    }

*/
