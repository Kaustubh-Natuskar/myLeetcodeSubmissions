class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] memo = new int[row][col];
        return mPSSolution(grid, 0, 0, row, col, memo);
    }
    public int mPSSolution(int[][] grid, int currRow, int currCol, int row, int col, int[][] memo){
        
        if(currRow == row-1 && currCol == col-1){
            return grid[currRow][currCol];
        }
        
        if(currRow >= row || currCol >= col){
            return Integer.MAX_VALUE;
        }
        
       if(memo[currRow][currCol] != 0)
          return memo[currRow][currCol];
        
        int down = mPSSolution(grid, currRow+1, currCol, row, col, memo);
        int right = mPSSolution(grid, currRow, currCol+1, row, col, memo);
        
        memo[currRow][currCol] = grid[currRow][currCol] + Math.min(down , right);
        
        return memo[currRow][currCol];
    }
}