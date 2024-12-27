class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        /* TLE
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int currMax = Math.min(height[i], height[j]) * (j-i);
                max = Math.max(max, currMax);
            }
        }
        return max;
        */
        int i=0, j=height.length-1;
        while(i<j){
            int currMax = Math.min(height[i], height[j]) * (j-i);
            max = Math.max(max, currMax);
            if(height[i] < height[j]){
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}