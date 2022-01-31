// { Driver Code Starts
// Initial Template for Java
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
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        /*for(int i=0; i<v; i++){
            
            if(vis[i] == false){
            vis[i]=true;
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            
             while(!q.isEmpty()){
                    Integer node = q.poll();
                    bfs.add(node);
                    
                    for(Integer k : adj.get(node)){
                        if(vis[k] == false){
                            vis[k]=true;
                            q.add(k);
                        }
                    }
                

                }
            
            }
        }
        return bfs; */
        
        boolean[] vis = new boolean[v];
        ArrayList<Integer> bfs =  new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        vis[0]=true;
        q.add(0);
        bfs.add(0);
        
        while(!q.isEmpty() ){
            int node = q.poll();
            for(Integer k: adj.get(node)){
                if(vis[k] == false){
                    q.add(k);
                    vis[k]=true;
                    bfs.add(k);
                }
            }
        }
        return bfs;
    }
}