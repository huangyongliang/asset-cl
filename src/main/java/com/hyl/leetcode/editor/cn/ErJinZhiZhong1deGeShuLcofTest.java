package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ErJinZhiZhong1deGeShuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n & (n - 1));
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


