class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int l=i+1, r=nums.length-1, a=nums[i];
            while(l<r){
                int sum = a + nums[l] + nums[r];
                if(sum > 0){
                    r--;
                } else if(sum < 0){
                    l++;
                } else if(sum == 0){
                    list.add(Arrays.asList(a ,nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1])
                        l++;
                }
            }
        }
        return list;
    }
}