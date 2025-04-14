class Solution {
    public int maxArea(int[] height) {
        int max = 0, i=0, j=height.length-1;
        /*for(int i=0; i<n; i++) {
            for(int j = i+1; j<n; j++){
                max = Math.max(max, Math.min(height[i], height[j]) * (j-i));
            }
        }
        return max; */

        while(i<j) {
            max = Math.max(max, Math.min(height[i], height[j]) * (j-i));
            if(height[i] < height[j])
                i++;
            else
                j--;
        }

        return max;
    }
}