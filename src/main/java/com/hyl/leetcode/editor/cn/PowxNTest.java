package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class PowxNTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        double res = solution.myPow(2.00000, 2147483647);
        // double res = Math.pow(1.00000, 2147483647);

        System.out.println(res);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double myPow(double x, int n) {

        return myPow2(x, n);
    }


public double myPow2(double x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n < 0) {
            return 1 / myPow2(x, -n);
        }

        if (n % 2 == 0) {
            return myPow2(x * x, n / 2);
        } else {
            return x * myPow2(x * x, n / 2);
        }

    }


}
//leetcode submit region end(Prohibit modification and deletion)

}


