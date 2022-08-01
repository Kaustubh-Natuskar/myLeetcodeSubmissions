class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
       // map.put(nums[0],0);
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int lastOccurence = map.get(nums[i]);
                if(Math.abs(lastOccurence-i) <= k) {
                    return true;
                }
                
            }
            map.put(nums[i],i);
        }
        return false;
    }
}