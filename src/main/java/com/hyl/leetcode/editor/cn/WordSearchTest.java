package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class WordSearchTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(solution.exist(board, word));


    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean exist(char[][] board, String word) {

        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) {
            return false;
        }
        if (k == word.length - 1) {
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '/';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i,
            j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = temp;
        return res;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}


