class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       int[] ans = new int[2];

       for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                ans[0] = i;
                ans[1] = map.get(target-nums[i]);
                return ans;
            }
            map.put(nums[i], i);
       }

       return ans;
    }
}