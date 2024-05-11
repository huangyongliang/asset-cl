package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class OneNzhengShuZhong1chuXianDeCiShuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(solution.countDigitOne(10));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for (long i = 1; i <= n; i *= 10) {
            long a = n / i;
            long b = n % i;
            if (a % 10 == 1) {
                count += (a / 10) * i + b + 1;
            } else {
                count += (a / 10) * i + i;
            }
        }
        return count;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}


