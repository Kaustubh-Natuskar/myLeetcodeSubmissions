// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited = new boolean[v+1];
         boolean[] DFSvisited = new boolean[v+1];
        
        for(int i=0; i<v; i++){
            if(visited[i] == false)
                if(isCycle(adj, visited, DFSvisited, i))
                    return true;
        }
        
        return false;
    }
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj, 
                        boolean[] visited, boolean[] DFSvisited,int node){
    
        visited[node] = true;
        DFSvisited[node] = true;
        for(Integer i : adj.get(node)){
            if(visited[i] == false){
                if(isCycle(adj, visited,DFSvisited, i) == true)
                    return true;
            }
            else if(DFSvisited[i] == true) 
                    return true;
              
        }
         DFSvisited[node] =false;
        return false;
                                
    }
}