// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
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
        
        dfs(cr-1,cc+1,grid,n,m);
        dfs(cr+1,cc+1,grid,n,m);
        dfs(cr+1,cc-1,grid,n,m);
        dfs(cr-1,cc-1,grid,n,m);
        
    }
}