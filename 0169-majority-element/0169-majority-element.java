class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, num = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(num == nums[i])
                count = count + 1;
            else 
                count = count - 1;
            
            if(count == 0) {
                num = nums[i];
                count = 1;
            }
        }

        return num;
    }
}