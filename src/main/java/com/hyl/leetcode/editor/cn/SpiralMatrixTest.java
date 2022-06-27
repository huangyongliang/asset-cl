package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SpiralMatrixTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        int[][] matrix = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> result = solution.spiralOrder(matrix);
        System.out.println(result);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {

            List<Integer> result = new ArrayList<Integer>();
            int stand = matrix[0].length;
            int row = matrix.length;

            runMatrix(matrix, 0, row - 1, 0, stand - 1, 0, result);
            return result;

        }

        private void runMatrix(int[][] matrix, int rowB, int rowE, int standB, int standE, int direction,
            List<Integer> result) {

            if (rowB > rowE || standB > standE)
                return;

            switch (direction) {
                case 0: {
                    for (int i = standB; i <= standE; i++) {
                        result.add(matrix[rowB][i]);
                    }
                    runMatrix(matrix, rowB + 1, rowE, standB, standE, 1, result);
                    break;
                }

                case 1: {
                    for (int i = rowB; i <= rowE; i++) {
                        result.add(matrix[i][standE]);
                    }
                    runMatrix(matrix, rowB, rowE, standB, standE - 1, 2, result);
                    break;
                }
                case 2: {
                    for (int i = standE; i >= standB; i--) {
                        result.add(matrix[rowE][i]);
                    }
                    runMatrix(matrix, rowB, rowE - 1, standB, standE, 3, result);
                    break;
                }
                case 3: {
                    for (int i = rowE; i >= rowB; i--) {
                        result.add(matrix[i][standB]);
                    }
                    runMatrix(matrix, rowB, rowE, standB + 1, standE, 0, result);
                }
                default:

            }

        }

    }
    //leetcode submit region end(Prohibit modification and deletion)

}


