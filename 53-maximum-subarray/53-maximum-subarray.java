class Solution {
    public int maxSubArray(int[] n) {
        int s=0;
        int max=n[0];
        for(int i=0; i<n.length; i++){
            s+=n[i];
            max=Math.max(s,max);
            if(s<0) s=0;
        }
        return max;
    }
}