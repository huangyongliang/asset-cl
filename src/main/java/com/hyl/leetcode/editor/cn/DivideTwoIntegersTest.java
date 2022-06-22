package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class DivideTwoIntegersTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int result = solution.divide(10, 3);
        System.out.println(result);


    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int divide(int dividend, int divisor) {

            if (divisor == 0) {
                return Integer.MAX_VALUE;
            }
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }
            int sign = 1;
            if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
                sign = -1;
            }
            long a = Math.abs((long) dividend);
            long b = Math.abs((long) divisor);
            int res = 0;
            while (a >= b) {
                long temp = b;
                int count = 1;
                while (a >= (temp << 1)) {
                    temp <<= 1;
                    count <<= 1;
                }
                a -= temp;
                res += count;
            }
            return sign == 1 ? res : -res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}


