class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean zeroCol = false;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if(j<1)
                        zeroCol = true;
                    else
                        matrix[0][j] = 0;
                }
            }
        }

        for(int i=1; i<rows; i++) {
            for(int j=1; j<cols; j++) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
            }
        }

        if(matrix[0][0] == 0) {
            for(int j=0; j<cols; j++)
                matrix[0][j] = 0;
        }

        if(zeroCol) {
            for(int i=0; i<rows; i++)
                matrix[i][0] = 0;
        }
    }
}