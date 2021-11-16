class Solution {
    public int rob(int[] nums) {
       return maxMoney(nums, 0, new HashMap<Integer,Integer>() );
    }
    public int maxMoney(int[] nums, int currIndex , HashMap<Integer,Integer> map){
        
        if(currIndex >= nums.length)
            return 0;
        
        int currKey=currIndex;
        
        if(map.containsKey(currKey))
            return map.get(currKey);
            
            
        int rob= nums[currIndex] + maxMoney(nums, currIndex+2 , map);
        int notRob= maxMoney(nums, currIndex+1 , map);
        
        map.put(currKey , Math.max(rob, notRob) );
        
        return Math.max(rob, notRob);
    }
}