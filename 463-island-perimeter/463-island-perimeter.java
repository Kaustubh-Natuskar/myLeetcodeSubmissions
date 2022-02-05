class Solution {
    int perimeter=0;
    public int islandPerimeter(int[][] grid) {
       
        int n = grid.length;
        int m = grid[0].length;
        boolean flag = false;
        boolean[][] visited = new boolean[n][m];
        
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    return dfs(i, j, n, m, visited, grid);

                }
            }
        }
         return perimeter;
    }
    public int dfs(int cr, int cc, int n, int m, boolean[][] visited, int[][] grid){
        if(cr >= n || cr < 0 || cc >= m || cc < 0 || grid[cr][cc] == 0)
            return 1;
        if(visited[cr][cc] == true)
            return 0;
        
        visited[cr][cc] = true;
        
        perimeter = dfs(cr, cc+1, n, m , visited, grid);
        perimeter += dfs(cr+1, cc, n, m , visited, grid);
        perimeter += dfs(cr, cc-1, n, m , visited, grid);
        perimeter += dfs(cr-1, cc, n, m , visited, grid);
        
        return perimeter;
    }
}