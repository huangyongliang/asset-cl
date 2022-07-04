package com.hyl.leetcode.editor.cn;

import java.math.BigInteger;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class JianShengZiIiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

        System.out.println(solution.cuttingRope(10));

    }
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int cuttingRope(int n) {
            BigInteger[] dp = new BigInteger[n + 1];
            Arrays.fill(dp, BigInteger.valueOf(1));
            // dp[1] = BigInteger.valueOf(1);
            for(int i = 3; i < n + 1; i++){
                for(int j = 1; j < i; j++){
                    dp[i] = dp[i].max(BigInteger.valueOf((long) j * (i - j))).max(dp[i - j].multiply(BigInteger.valueOf(j)));
                }
            }
            return dp[n].mod(BigInteger.valueOf(1000000007)).intValue();
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}


