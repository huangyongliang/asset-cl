package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class FirstMissingPositiveTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int []nums = new int[]{2,1};
        System.out.println(solution.firstMissingPositive(nums));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstMissingPositive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 1;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;

    }




}
//leetcode submit region end(Prohibit modification and deletion)

}


