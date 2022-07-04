package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class JianShengZiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(solution.cuttingRope(10));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        dp[2] =1;
        for (int i= 3;i<=n;i++){
            for (int j=2;j<i;j++){
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}


