class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solution(nums, ans, list, 0);
        return ans;
    }

    public void solution(int[] nums, List<List<Integer>> ans, ArrayList<Integer> list, int i) {
        if(i>=nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        solution(nums, ans, list, i+1);
        list.remove(list.size()-1);
        while(i < nums.length-1 && (nums[i] == nums[i+1]))
            i++;
        
        solution(nums, ans, list, i+1);
    }

}