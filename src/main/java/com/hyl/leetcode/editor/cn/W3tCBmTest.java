package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class W3tCBmTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] ints = solution.countBits(5);
        System.out.println(Arrays.toString(ints));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] countBits(int n) {

        if (n == 0) {
            return new int[]{0};
        }
        int[] res = new int[n + 1];
        res[0] = 0;
        for (int i = 1; i <= n; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


