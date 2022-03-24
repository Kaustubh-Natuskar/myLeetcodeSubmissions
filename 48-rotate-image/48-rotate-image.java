class Solution {
    public void rotate(int[][] matrix) {
        transposeOfMatrix(matrix);
        reverseRows(matrix);
    }
    
    public void transposeOfMatrix(int[][] matrix){
       for(int i=0; i<matrix.length; i++)
           for(int j=i; j<matrix.length; j++)
               swap(matrix,i,j);
    }
    
    public void reverseRows(int[][] matrix){
        int n=matrix.length;
         for(int i=0; i<n; i++){
             int k=n-1;
             for(int j=0; j<n/2; j++){
                 swap(matrix,i,j,k--);
             }
         }
    }
    
    public void swap(int[][] matrix, int i, int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
     public void swap(int[][] matrix, int i, int j, int k){
         int temp=matrix[i][j];
         matrix[i][j]=matrix[i][k];
         matrix[i][k]=temp;
     }
}