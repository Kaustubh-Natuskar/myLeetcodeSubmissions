class Solution {
    public void rotate(int[][] matrix) {
        transposeMatrix(matrix);
        reverseRowsOfMatrix(matrix);
    }
    public void transposeMatrix(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
  public void reverseRowsOfMatrix(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n / 2; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n - 1 - j];
        matrix[i][n - 1 - j] = temp;
      }
    }
  }
}