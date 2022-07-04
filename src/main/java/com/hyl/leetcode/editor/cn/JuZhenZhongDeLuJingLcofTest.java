package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class JuZhenZhongDeLuJingLcofTest {

    @Test
    public void test() {
        Solution solution = new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean exist(char[][] board, String word) {

            if (board.length == 0) {
                return false;
            }
            if (board[0].length == 0) {
                return false;
            }
            if (word.length() == 0) {
                return true;
            }
            int row = board.length;
            int col = board[0].length;
            boolean[][] visited = new boolean[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (dfs(board, word, i, j, 0, visited)) {
                        return true;
                    }
                }
            }
            return false;

        }

        public boolean dfs(char[][] board, String word, int row, int col, int index, boolean[][] visited) {
            if (index == word.length()) {
                return true;
            }
            if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
                return false;
            }
            if (visited[row][col]) {
                return false;
            }
            if (board[row][col] != word.charAt(index)) {
                return false;
            }
            visited[row][col] = true;
            boolean result =
                   dfs(board, word, row + 1, col, index + 1, visited)
                || dfs(board, word, row - 1, col, index + 1, visited)
                || dfs(board, word, row, col + 1, index + 1, visited)
                || dfs(board, word, row, col - 1, index + 1, visited);
            visited[row][col] = false;
            return result;
        }

    }
    //leetcode submit region end(Prohibit modification and deletion)

}


