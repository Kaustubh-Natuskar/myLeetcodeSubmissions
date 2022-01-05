class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> currRes= new ArrayList<>();
        
        subsetSolu(0, result, currRes, nums);
        return result;
    }
    private void subsetSolu(int curr, List<List<Integer>> result, List<Integer> currRes, int[] nums){
        
        if(curr >= nums.length){
            result.add(new ArrayList<Integer>(currRes));
            return;
        }
        
        int currVal = nums[curr];
        
        currRes.add(currVal);
        subsetSolu(curr+1, result, currRes, nums);
        
        currRes.remove(currRes.size()-1);
        subsetSolu(curr+1, result, currRes, nums);
    }
}