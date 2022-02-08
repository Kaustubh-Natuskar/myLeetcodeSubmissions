class Solution {
    public int findCenter(int[][] edges) {
       int[] count = new int[edges.length+10]; 
        for(int i=0; i<edges.length; i++){
            for(int j=0; j<2; j++){
                count[edges[i][j]] += 1;
            }
        }
        int ans=0;
        for(int i=1; i<count.length; i++){
            if(count[i] != 1){
                ans=i;
                break;
            }
        }
        return ans;
    }
}