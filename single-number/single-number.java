class Solution {
    public int singleNumber(int[] nums) {
        int number =0;
    
    int len = nums.length;
    for(int i=0;i<len;i++)
        number ^= nums[i];
    
    return number; 
    }
}