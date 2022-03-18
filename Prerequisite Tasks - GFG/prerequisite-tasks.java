// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String args[]) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t>0)
		{
		    int N = sc.nextInt();
		    int P = sc.nextInt();
		    int prerequisites[][] = new int[P][2];
		    for(int i=0;i<P;i++)
		    {
		        for(int j=0;j<2;j++)
		        {
		            prerequisites[i][j] = sc.nextInt();
		        }
		    }
			Solution ob = new Solution();
			if(ob.isPossible(N,prerequisites))
			{
			    System.out.println("Yes");
			}
			else{
			    System.out.println("No");
			}
			t--;
		}
	}
	
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static boolean[] vis;
   static boolean[] dvis;
   boolean sol(int V,ArrayList<ArrayList<Integer>> adj){
       vis[V]=true;
       dvis[V]=true;
       for(int i:adj.get(V)){
           if(vis[i]==false){
               if(sol(i,adj))
                  return true;
           }
           else if(dvis[i]==true)
                return true;
       }
       dvis[V]=false;
       return false;
   }
    public boolean isPossible(int N, int[][] prerequisites)
    {
        // Your Code goes here
       vis = new boolean[N];
       dvis = new boolean[N];
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
       for(int i=0;i<N;i++){
           adj.add(new ArrayList<>());
       }
       for(int i=0;i<prerequisites.length;i++){
           adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
       }

       for(int i=0;i<N;i++){
           vis[i]=false;
       }
       for(int i=0;i<N;i++){
           dvis[i]=false;
       }
       //System.out.println(adj);
       for(int i=0;i<N;i++){
           if(vis[i]==false){
           if(sol(i,adj))
              return false;
           }
       }
       return true;
    }

}

