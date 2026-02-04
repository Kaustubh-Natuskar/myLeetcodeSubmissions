class Solution {
    public int maxProduct(int[] nums) {
        int currMax = 1, currMin = 1;
        int res = nums[0];

        for(int num : nums) {
            int temp = currMax * num;
            currMax = Math.max(num, Math.max(temp, num*currMin));
            currMin = Math.min(num, Math.min(temp, num*currMin));
            res = Math.max(res, currMax);
        }

        return res;
    }
}