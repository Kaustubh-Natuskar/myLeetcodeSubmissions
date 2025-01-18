class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        for(int r=0; r<nums.length; r++){
            if(nums[r] != 0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
    }
}