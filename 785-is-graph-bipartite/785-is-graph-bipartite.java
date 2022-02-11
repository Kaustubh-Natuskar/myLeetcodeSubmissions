class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int[n];
        
        for(int i=0; i<n; i++)
            color[i]=-1;
        
        for(int i=0; i<n; i++){
            if(color[i] == -1)
                if(!biChk(i,graph,color))
                    return false;
        }
        return true;
    }
    
    public boolean biChk(int node, int[][] graph, int[] color){
        if(color[node] == -1)
            color[node]=1;
        for(Integer i : graph[node]){
            if(color[i] == -1){
                color[i] = 1 - color[node];
                if(!biChk(i, graph, color))
                    return false;
            }else if(color[node] == color[i])
                        return false;
        }
        return true;
    }
        
}