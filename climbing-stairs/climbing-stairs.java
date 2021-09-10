class Solution {
    public int climbStairs(int n) {
      if(n<=0) return 0;
      if(n==1) return 1;
      if(n==2) return 2;
        
        int oneBack=2;
        int twoBack=1;
        int ans=0;
            for(int i=2;i<n;i++){
                ans=oneBack+twoBack;
                twoBack=oneBack;
                oneBack=ans;
            }
        return ans;
    }
    
}