class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int medium = low + (high - low) / 2;

            if (target < matrix[medium][0]) {
                high = medium - 1;
            } else if (target > matrix[medium][n - 1]) {
                low = medium + 1;
            } else {
                // target is in this row's range — reset left/right for this row
                int left = 0, right = n - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (target == matrix[medium][mid])
                        return true;
                    else if (target < matrix[medium][mid])
                        right = mid - 1;
                    else
                        left = mid + 1;
                }
                return false; // row was right, value isn't in it
            }
        }
        return false;
    }
}