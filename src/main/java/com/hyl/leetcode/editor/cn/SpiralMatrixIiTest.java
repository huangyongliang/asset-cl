package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class SpiralMatrixIiTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (num <= n * n) {
            // 填充上边界
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // 填充右边界
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // 填充下边界
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // 填充左边界
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}


