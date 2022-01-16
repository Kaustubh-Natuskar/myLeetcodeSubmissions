class Solution {
    public int maxDistToClosest(int[] seats) {
        
        int ans=0;
        int count=0;
        int len=seats.length; 
        
        for(int i=0; i<len; i++){
            
            if(seats[i] == 0){
                count++;
                ans=Math.max(ans,count);
            }
            else{
                count=0;
            }
            
        }
        
        int right=0;
        count=0;
        
        for(int i=len-1; i>=0; i--){
            
            if(seats[i] == 0){
                count++;
                right=Math.max(right,count);
            }
            else{
                break;
            }
        }
        
        int left=0;
        count=0;
        
        for(int i=0; i<len; i++){
            
            if(seats[i] == 0){
                count++;
                left=Math.max(left,count);
            }
            else{
                break;
            }
        }
        
        int finalAnser=(ans+1)/2;
        finalAnser=Math.max(right,finalAnser);
        finalAnser=Math.max(left,finalAnser);
        
        return finalAnser;
    }
}