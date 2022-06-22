package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


