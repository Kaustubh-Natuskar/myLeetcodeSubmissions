class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(nums[mid] < target){
                low = mid + 1;
            } else if(nums[mid] > target){
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}