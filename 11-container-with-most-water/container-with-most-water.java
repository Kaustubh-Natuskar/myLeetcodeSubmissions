class Solution {
    public int maxArea(int[] height) {
        int area = 0, i=0, j=height.length-1;
        while(i<j) {
            int length = j-i;
            int currArea = Math.min(height[i], height[j]) * length;
            area = Math.max(area, currArea);
            if(height[i] < height[j])
                i++;
            else
                j--;
        }

        return area;
    }
}