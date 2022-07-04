package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class QingWaTiaoTaiJieWenTiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numWays(int n) {

        if (n==0) {
            return 1;
        }

        if (n==1) {
            return 1;
        }

        if (n==2) {
            return 2;
        }
        final int MOD = 1000000007;

        int pre = 1;
        int cur = 2;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = (pre + cur ) % MOD;
            pre = cur;
            cur = temp;
        }
        return cur;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


