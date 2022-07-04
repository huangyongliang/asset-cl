package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class FeiBoNaQiShuLieLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int fib = solution.fib(121);
        System.out.println(fib);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int fib(int n) {

        if (n<2) {
            return n;
        }
        final int MOD = 1000000007;

        int pre = 0;
        int cur = 1;
        int temp = 0;
        for (int i = 2; i <= n; i++) {
            temp = (pre + cur) % MOD;
            pre = cur;
            cur = temp;
        }
        return cur;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


