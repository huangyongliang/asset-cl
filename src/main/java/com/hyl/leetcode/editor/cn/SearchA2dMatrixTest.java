package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class SearchA2dMatrixTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean b = solution.searchMatrix(matrix, 3);
        System.out.println(b);
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / n][mid % n];
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


