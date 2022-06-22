package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int n = 3;
        int result = solution.climbStairs(n);
        System.out.println(result);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


