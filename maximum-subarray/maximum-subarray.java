class Solution {
    public int maxSubArray(int[] nums) {
        /*int max=Integer.MIN_VALUE;
        int sum=0;
        int currMax=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;){
                sum=sum+nums[j];
                if(sum>currMax)
                    currMax=sum;
                }
            if(currMax>max)
                max=currMax;
        }
        return max; 
        */
        int sum=0,max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max) max=sum;
            if(sum<0) sum=0;
        }
        return max;
        
    }
}