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
    public boolean isPossible(int N, int[][] prerequisites)
    {
        // Your Code goes here
        // Your Code goes here
        int n=prerequisites.length;
        //ArrayList<Integer> list[]= new ArrayList[N];
         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
         for(int i=0;i<N;i++){
           list.add(new ArrayList<>());
       }
         for(int i=0;i<prerequisites.length;i++){
           list.get(prerequisites[i][0]).add(prerequisites[i][1]);
       }
         
        boolean vis[]= new boolean[N];
        boolean dfsvis[]= new boolean[N];
        for(int i=0;i<N;i++){
           vis[i]=false;
       }
       for(int i=0;i<N;i++){
           dfsvis[i]=false;
       }
        //for (int i=0;i<N;i++){
            //list[i]= new ArrayList<>();
       // }
       // for (int i=0;i<n;i++){
            //list[prerequisites[i][0]].add(prerequisites[i][1]);
        //}
        for (int i=0;i<N;i++){
            if (vis[i]==false){
                if (check(i,list,vis,dfsvis))return false;
            }
        }
        return true;
    }
    static boolean check(int node,ArrayList<ArrayList<Integer>> list,boolean vis[],boolean dfs[]){
        vis[node]=true;
        dfs[node]=true;
        for (int i:list.get(node)){
            if (vis[i]==false){
                if (check(i,list,vis,dfs))return true;
            }
            else if (dfs[i])return true;
        }
        dfs[node]=false;
        return false;
    }
    
}

