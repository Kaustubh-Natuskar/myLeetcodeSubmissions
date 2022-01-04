// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
       
       int visited[][] = new int[n][n];
       
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               visited[i][j]=0;
           }
       }
       int di[] = {+1,0,0,-1};
       int dj[] = {0,-1,1,0}; 
        
        ArrayList<String> ans = new ArrayList<>();
        
        if(m[0][0] == 1)
        solveRIM(0,0,m,n,ans,"",visited,di,dj);
        return ans;
    }
    
    private static void solveRIM(int i, int j, int a[][], int n,
        ArrayList<String> ans, String move, int[][] visited, int di[] , int dj[] ){
            
            if(i == n-1 && j == n-1){
                ans.add(move);
                return;
            }
            
            String dir = "DLRU";
            
            for(int index=0; index<4; index++){
                    
                int nexti = i + di[index];
                int nextj = j + dj[index];
                
                if(nexti >= 0 && nextj >= 0 && nexti < n && nextj < n
                    && visited[nexti][nextj] == 0 && a[nexti][nextj] == 1){
                        
                        visited[i][j] = 1;
                        
                        solveRIM(nexti, nextj, a, n, ans, move + dir.charAt(index), visited, di, dj);
                        visited[i][j] = 0;
                    }
            }
        }
    
}












