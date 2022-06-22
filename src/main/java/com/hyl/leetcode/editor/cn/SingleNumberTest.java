package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class SingleNumberTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];
        }

        return nums[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


