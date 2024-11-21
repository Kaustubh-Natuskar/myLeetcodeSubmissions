class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        if(nums.length == 1) return nums[0];

        for(int i=0; i< nums.length; i++){
            currSum = currSum + nums[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }

        }
        /* for(int i=0; i<nums.length; i++){
            int currSum=0;
            for(int j=i; j<nums.length; j++){
                currSum = nums[j]+currSum;
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        } */
        return maxSum;
    }
}