class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        int len = graph.length;
        helper(graph, ans, 0, len, new ArrayList<Integer>(), visited);
        return ans;
    }
     public void helper(int[][] graph, List<List<Integer>> ans, int node, 
                        int len, List<Integer> currPath, boolean[] visited){
         
         if(node ==  len-1){
             visited[node]=false;
             currPath.add(node);
             ans.add(new ArrayList<Integer>(currPath));
             currPath.remove(currPath.size()-1);
             return;
         }
         if(visited[node] == true)
             return;
         visited[node] = true;
         currPath.add(node);
         for(Integer neighbour : graph[node])
             helper(graph, ans, neighbour, len, currPath, visited);
         visited[node]=false;
         currPath.remove(currPath.size()-1);
     }
}