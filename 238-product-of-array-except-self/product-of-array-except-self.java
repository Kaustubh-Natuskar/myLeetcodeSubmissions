class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];
        int[] ans = new int[nums.length];

        pre[0] = nums[0];
        suff[n-1] = nums[n-1];

        for(int i=1; i<n; i++){
            pre[i] = nums[i] * pre[i-1];
        }
        for(int i=n-2; i>=0; i--){
            suff[i] = nums[i] * suff[i+1];
        }

        for(int i=0; i<n; i++){
            if(i==0){
                ans[0] = suff[i+1];
            } else if(i==n-1){
                ans[n-1] = pre[i-1];
            } else {
                ans[i] = pre[i-1] * suff[i+1];
            }
        }

        return ans;
    }
}