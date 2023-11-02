class Solution {
    public int maxProduct(int[] nums) {
        int pre = 1;
        int suf = 1;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            pre = nums[i]*pre;
            suf = nums[n-i-1]*suf;
            max = Math.max(max, Math.max(suf, pre));
            if(pre == 0) pre = 1;
            if(suf == 0) suf = 1;
        }

        return max;
    }
}