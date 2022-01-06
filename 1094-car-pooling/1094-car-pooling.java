class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int coordinates[] = new int[10001];
        int length= trips.length;
        
        for(int i=0; i<length; i++){
               
            int cap=trips[i][0];
            int start=trips[i][1];
            int end=trips[i][2];
            coordinates[start]+=cap;
            coordinates[end]-=cap;  
        }
        
        int sum=0;
        for(int i=0; i<1001; i++){
            sum= sum+coordinates[i];
            if(sum>capacity)
                return false;
        }
        return true;
    }
}