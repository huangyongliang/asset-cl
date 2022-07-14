package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class Qiu12nLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumNums(int n) {
        if (n<=1)
            return n;

        return sumNums(n-1)+n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


