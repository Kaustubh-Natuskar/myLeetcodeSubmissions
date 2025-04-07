class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> startings = new ArrayList<>();

        for(int i=0; i<nums.length; i++)
            set.add(nums[i]);

        int ans = 0;

        for (Integer i : set) {
            if(!set.contains(i - 1)) {
                int count = 1;
                while(set.contains(i+1)){
                    count++; i++;
                }
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}