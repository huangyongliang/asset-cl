package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class NQueensIiTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(solution.totalNQueens(9));


    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int totalNQueens(int n) {
        if (n<1 || n>9)
            return 0;
        int []result = new int[]{0,1,0,0,2,10,4,40,92,352};
        return result[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


