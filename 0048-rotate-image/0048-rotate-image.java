class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverseColumns(matrix);
    }
    public void transpose(int[][] matrix) {
        for(int i=0; i<matrix[0].length; i++) {
            for (int j=i; j<matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void reverseColumns(int[][] matrix) {
        int n = matrix[0].length;
        for(int i=0; i<matrix[0].length; i++) {
            for (int j=0; j<matrix[0].length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }

}