class Solution {
    public int pivotIndex(int[] nums) {
        int ls = 0, total = 0;
        for(int i : nums){
            total += i;
        }
        for(int i=0; i<nums.length; i++){
            int rs = total - nums[i] - ls;
            if(rs == ls) return i;
            ls += nums[i];
        }
        return -1;
    }
}