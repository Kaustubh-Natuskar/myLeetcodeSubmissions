class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) 
            return image;
        int oldColor = image[sr][sc];
        int n = image.length;
        int m = image[0].length;
        floodFiller(image, sr, sc, newColor, oldColor, n, m);
        return image;
    }
    public void floodFiller(int[][] image, int sr, int sc, int newColor, int oldColor, int n, int m){ 
        
        if(sr >= n || sc >= m || sr < 0 || sc < 0 ||  image[sr][sc] != oldColor)
            return;
        
        if(image[sr][sc] == oldColor)
            image[sr][sc] = newColor;
        
        floodFiller(image, sr, sc+1, newColor, oldColor, n, m);
        floodFiller(image, sr+1, sc, newColor, oldColor, n, m);
        floodFiller(image, sr, sc-1, newColor, oldColor, n, m);
        floodFiller(image, sr-1, sc, newColor, oldColor, n, m);
    }
}