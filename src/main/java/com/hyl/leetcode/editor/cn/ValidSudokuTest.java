package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ValidSudokuTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(solution.isValidSudoku(board));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValidSudoku(char[][] board) {

        if (board == null || board.length == 0) {
            return false;
        }

        // 检查行
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (row[num]) {
                        return false;
                    }
                    row[num] = true;
                }
            }
        }

        // 检查列
        for (int i = 0; i < 9; i++) {
            boolean[] col = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    int num = board[j][i] - '1';
                    if (col[num]) {
                        return false;
                    }
                    col[num] = true;
                }
            }
        }

        // 检查九宫格
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                boolean[] box = new boolean[9];
                for (int m = 0; m < 3; m++) {
                    for (int n = 0; n < 3; n++) {
                        if (board[i + m][j + n] != '.') {
                            int num = board[i + m][j + n] - '1';
                            if (box[num]) {
                                return false;
                            }
                            box[num] = true;
                        }
                    }
                }
            }
        }

        return true;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


