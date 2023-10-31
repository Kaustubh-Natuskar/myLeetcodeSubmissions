class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
            max = Math.max(max, sum);
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}