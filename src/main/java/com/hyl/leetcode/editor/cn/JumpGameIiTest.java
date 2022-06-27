package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class JumpGameIiTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(Arrays.toString(nums));
        System.out.println(solution.jump(nums));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int jump(int[] nums) {
            int border = 0;
            int max = 0;
            int step = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                max = Math.max(max, nums[i] + i);
                if (i == border) {
                    border = max;
                    step++;
                }
            }
            return step;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}


