class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0, n=nums.length;
        for (int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        
        int LSum=0,RSum=sum,flag=-1;
        
        for(int i=0;i<n;i++){
            RSum=RSum-nums[i];
            
            if(RSum==LSum){
                flag=i;
                break;
            }
            else{
                LSum=LSum+nums[i];
            }
            
        }
        return flag;
    }
}