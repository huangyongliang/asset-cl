package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ClumsyFactorialTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        int n = 10;
        int result = solution.clumsy(n);
        System.out.println(result);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int clumsy(int n) {
                if (n == 1 || n == 2)
                    return n;
                if (n == 3)
                    return 6;
                if (n == 4)
                    return 7;
                //上面是特殊情况，下面是根据公式推算的
                if (n % 4 == 0)
                    return n + 1;
                if (n % 4 == 1 || n % 4 == 2)
                    return n + 2;
                return n - 1;
        }


    }
    //leetcode submit region end(Prohibit modification and deletion)

}


