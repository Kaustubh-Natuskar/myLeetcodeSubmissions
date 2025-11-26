class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean targetRow = false;
        int low = 0, high = matrix.length-1, targetRowNum = 0;
        int m = matrix.length, n = matrix[0].length;

        while(low <= high) {
            int mid = (low+high)/2;
            if(target >= matrix[mid][0] && target <= matrix[mid][n-1]) {
                targetRowNum = mid;
                targetRow = true;
                break;
            } else if(target < matrix[mid][0]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if(!targetRow) {
            return false;
        }
        System.out.print("im here");
        low = 0;
        high = n-1;

        while(low<=high) {
            int mid = (low+high)/2;
            if(target < matrix[targetRowNum][mid])
                high = mid-1;
            else if(target > matrix[targetRowNum][mid])
                low = mid +1;
            else 
                return true;
        }

        return false;
    }
}