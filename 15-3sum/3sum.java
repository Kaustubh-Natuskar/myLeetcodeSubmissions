class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> ansSet = new HashSet<List<Integer>>();
        for(int i=0; i<n; i++) {
            int target = -1 * nums[i];
            Set<Integer> set = new HashSet<>();
            for(int j=i+1; j<n; j++) {
                if(set.contains(target-nums[j])){
                    List<Integer> list = new ArrayList<>();
                    list.add(target * -1);
                    list.add(target-nums[j]);
                    list.add(nums[j]);
                    Collections.sort(list);
                    ansSet.add(list);
                }
                set.add(nums[j]);
            }

        }

        List<List<Integer>> arr = new ArrayList<>(ansSet);

        return arr;

    }
}